package com.pos.library;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriBuilderException;

/**
 *
 * @author Reza
 */
public class RestController {
    
    private String token;
    private List<Map<String, Object>> mapLoginUserToRuangan;
    private List<Map<String, Object>> mapPegawaiToModulAplikasi;

    public void Authenticate(String URL2, String USERNAME, String PASSWORD) {
        AUTH_RESPONSE(URL2, USERNAME, PASSWORD);
        if(CommonUtil.isNotNullOrEmpty(getToken())){
            SqLiteController sqlite = new SqLiteController();
            if(sqlite.checkExistingToken()!=0){
                sqlite.updateToken(getToken());
                sqlite.logging(getToken(), DateUtil.now().toString());
            } else{
                sqlite.saveToken(getToken());
                sqlite.logging(getToken(), DateUtil.now().toString());
            }
        }
    }

    private Map<String, Object> AUTH_REQUEST(String URL2, String USERNAME, String PASSWORD) {
        Map<String, Object> result = new HashMap<>();
        try {
            DefaultClientConfig config = new DefaultClientConfig();
            Client client = Client.create((ClientConfig)config);
            WebResource service = client.resource(UriBuilder.fromUri((String)URL2).build(new Object[0]));
            Map<String, Object> body = new HashMap<>();
            body.put("namaUser", USERNAME);
            body.put("kataSandi", PASSWORD);
            ClientResponse response = (ClientResponse)service.type("application/json").post(ClientResponse.class, (Object)JsonUtil.MapToJson(body));
            if(response.getStatus()!=200) {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
            }
            String responseBody = (String)response.getEntity(String.class);
            result = JsonUtil.JsonToMap(responseBody);
        }
        catch (IllegalArgumentException | UriBuilderException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public void AUTH_RESPONSE(String URL2, String USERNAME, String PASSWORD) {
        Map<String, Object> response = AUTH_REQUEST(URL2, USERNAME, PASSWORD);
        if (CommonUtil.isNotNullOrEmpty(response)) {
            Map<String, Object> messages = new HashMap<>();
            if (CommonUtil.isNotNullOrEmpty(response.get("data"))) {
                Map<String, Object> data = (Map<String, Object>)response.get("data");
                if (CommonUtil.isNotNullOrEmpty(data.get("mapLoginUserToRuanganSet"))) {
                    setMapLoginUserToRuangan((List)data.get("mapLoginUserToRuanganSet"));
                }
                if (CommonUtil.isNotNullOrEmpty(data.get("mapPegawaiToModulAplikasiSet"))) {
                    setMapLoginUserToRuangan((List)data.get("mapPegawaiToModulAplikasiSet"));
                }
            }
            if (CommonUtil.isNotNullOrEmpty(response.get("messages")) && CommonUtil.isNotNullOrEmpty((messages = (Map)response.get("messages")).get("X-AUTH-TOKEN"))) {
                setToken((String)messages.get("X-AUTH-TOKEN"));
            }
        }
    }

    /**
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token the token to set
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * @return the mapLoginUserToRuangan
     */
    public List<Map<String, Object>> getMapLoginUserToRuangan() {
        return mapLoginUserToRuangan;
    }

    /**
     * @param mapLoginUserToRuangan the mapLoginUserToRuangan to set
     */
    public void setMapLoginUserToRuangan(List<Map<String, Object>> mapLoginUserToRuangan) {
        this.mapLoginUserToRuangan = mapLoginUserToRuangan;
    }

    /**
     * @return the mapPegawaiToModulAplikasi
     */
    public List<Map<String, Object>> getMapPegawaiToModulAplikasi() {
        return mapPegawaiToModulAplikasi;
    }

    /**
     * @param mapPegawaiToModulAplikasi the mapPegawaiToModulAplikasi to set
     */
    public void setMapPegawaiToModulAplikasi(List<Map<String, Object>> mapPegawaiToModulAplikasi) {
        this.mapPegawaiToModulAplikasi = mapPegawaiToModulAplikasi;
    }

}