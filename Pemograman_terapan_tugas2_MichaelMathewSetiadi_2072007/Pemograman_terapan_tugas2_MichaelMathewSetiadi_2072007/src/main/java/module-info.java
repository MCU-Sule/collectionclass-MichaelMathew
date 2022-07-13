module com.example.pemograman_terapan_tugas2_michaelmathewsetiadi_2072007 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.pemograman_terapan_tugas2_michaelmathewsetiadi_2072007 to javafx.fxml;
    exports com.example.pemograman_terapan_tugas2_michaelmathewsetiadi_2072007;
    exports com.example.pemograman_terapan_tugas2_michaelmathewsetiadi_2072007.model;
}