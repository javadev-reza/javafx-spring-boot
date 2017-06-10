package com.pos.library;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Accordion;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;
import javafx.scene.control.TreeView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.StringConverter;

/**
 *
 * @author Reza
 */
public class JFXComponent {
    
    /**
     * @param TABLE  : new TableView();
     * @param HEADER : String HEADER[] = {"NO", "HEADER NAME 1", "HEADER NAME 2"};
     * @param DATA   : List<_Object> DATA = new ArrayList<>();
     * @param WIDTH  : Integer WIDTH[] = {50, 100, 100};
     */
    public void setDinamicTableView(TableView TABLE, String[] HEADER, Object[][] DATA, Integer[] WIDTH){
        try{
            TableView<ObservableList<String>> tableView = TABLE;

            ObservableList<String> header = FXCollections.observableArrayList();
            header.addAll(Arrays.asList(HEADER));
            for (int i = 0; i < header.size(); i++) {
                final int finalIdx = i;
                TableColumn<ObservableList<String>, String> column = new TableColumn<>(header.get(i));
                column.setMinWidth(WIDTH[finalIdx]);
                column.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().get(finalIdx)));
                tableView.getColumns().add(column);
            }

            ObservableList<ObservableList> data = FXCollections.observableArrayList();
            for(Object[] parent : DATA){
                ObservableList<Object> row = FXCollections.observableArrayList();
                row.addAll(Arrays.asList(parent));
                data.add(row);   
            }  
            TABLE.setItems(data);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * @param COMBOBOX : new ComboBox();
     * @param ITEMS    : List<_Items> ITEMS = new ArrayList<>();
     */
    public void setItemsComboBox(ComboBox COMBOBOX, List<Items> ITEMS){
        try{
            COMBOBOX.setConverter(new StringConverter<Items>() {
                @Override
                public String toString(Items object) {
                    return object.getName();
                }
                @Override
                public Items fromString(String string) {
                    return null;
                }
            });

            ObservableList<Items> items = 
                    FXCollections.observableArrayList();
            for(Items model : ITEMS){
                items.add(model);
            }
            COMBOBOX.setItems(items);
            getIdComboBox(COMBOBOX);
            getItemComboBox(COMBOBOX);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
     protected Integer resultInt;
    /**
     * @param COMBOBOX : new ComboBox();
     * @return 
     */
    public Integer getIdComboBox(ComboBox COMBOBOX){
        COMBOBOX.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Items>() {
            @Override
            public void changed(ObservableValue<? extends Items> observable, Items oldValue, Items newValue) {
                resultInt = observable.getValue().getId();
            }
        });
        return resultInt;
    }
    
    protected String resultString;
    /**
     * @param COMBOBOX : new ComboBox();
     * @return 
     */
    public String getItemComboBox(ComboBox COMBOBOX){
        COMBOBOX.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Items>() {
            @Override
            public void changed(ObservableValue<? extends Items> observable, Items oldValue, Items newValue) {
                resultString = observable.getValue().getName();
            }
        });
        return resultString;
    }

    /**
     * @param HAMBURGER
     * @param DRAWER
     */
    public void setSideBarMenu(JFXHamburger HAMBURGER, JFXDrawer DRAWER) {
        try {
            AnchorPane anchorPane = (AnchorPane) new FXMLLoader().load(getClass().getResource("/com/pos/fxml/SideBarMenu.fxml"));
            AnchorPane backAnchorPane = (AnchorPane) anchorPane.getChildren().get(1);
            Accordion accordion = (Accordion) backAnchorPane.getChildren().get(0);
            accordion.getPanes().addAll(setListTitledPane());
            DRAWER.setSidePane(anchorPane);

            HamburgerBackArrowBasicTransition transition = new HamburgerBackArrowBasicTransition(HAMBURGER);
            transition.setRate(-1.0);
            HAMBURGER.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
                transition.setRate(transition.getRate() * -1.0);
                transition.play();
                if (DRAWER.isShown()) {
                    DRAWER.close();
                } else {
                    DRAWER.open();
                }
            }
            );
            DRAWER.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
                transition.setRate(-1.0);
                transition.play();
                if (DRAWER.isShown()) {
                    DRAWER.close();
                }
            }
            );
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public List<TitledPane> setListTitledPane(){
        List<TitledPane> titledPaneList = new ArrayList<>();
        for(int i=0; i<10; i++){
            TitledPane titledPane = new TitledPane("Ke-"+String.valueOf(i), setStackPane(new StackPane()));
            PropertiesComponent.setPropertiesTitledPane(titledPane);
            titledPaneList.add(titledPane);
        }
        return titledPaneList;
    }
    
    public AnchorPane setAnchorPane(AnchorPane anchorPane){
        AnchorPane anchor = anchorPane;
        PropertiesComponent.setPropertiesAnchorPane(anchor);
        anchor.getChildren().add(setTreeView());
        return anchor;  
    }
    
    public StackPane setStackPane(StackPane stackPane){
        StackPane stack = stackPane;
        PropertiesComponent.setPropertiesStackPane(stack);
        stack.getChildren().add(setTreeView());
        return stack;
    }
    
    public TreeView<?> setTreeView(){
        TreeView<?> result = new TreeView<>();
        
        return result; 
    }
    
}
