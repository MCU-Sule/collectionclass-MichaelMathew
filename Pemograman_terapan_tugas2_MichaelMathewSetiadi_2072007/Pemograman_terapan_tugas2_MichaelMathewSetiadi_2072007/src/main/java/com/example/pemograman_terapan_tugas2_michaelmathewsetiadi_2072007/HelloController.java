package com.example.pemograman_terapan_tugas2_michaelmathewsetiadi_2072007;

import com.example.pemograman_terapan_tugas2_michaelmathewsetiadi_2072007.model.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {
    public TextField addNrp;
    public TextField AddNama;
    public TextField RemoveNRP;
    public TableView<Student> table1;
    public TableColumn<Integer,Student> column1;
    public TableColumn<String,Student> column2;

    private ObservableList<Student> oList;

    public void initialize(){
        oList = FXCollections.observableArrayList(
                new Student(2072001, "Ando"),
                new Student(2072002, "Bedo"),
                new Student(2072003, "Ceri"),
                new Student(2072004, "Dodi"),
                new Student(2072005, "Endo")
        );
        table1.setItems(oList);
        column1.setText("NRP");
        column1.setCellValueFactory(new PropertyValueFactory<>("nrp"));
        column2.setText("Nama");
        column2.setCellValueFactory(new PropertyValueFactory<>("nama"));
    }

    public void AddStudent(ActionEvent actionEvent) {
        int nrp = Integer.parseInt(addNrp.getText());
        String nama = AddNama.getText();
        addNrp.clear();
        AddNama.clear();
        oList.add(new Student(nrp, nama));

    }

    public void Remove(ActionEvent actionEvent) {
        int nrp = Integer.parseInt(RemoveNRP.getText());
        for (Student std: oList) {
            if (nrp == std.getNrp()) {
                oList.remove(std);
                break;
            }
        }
    }
}