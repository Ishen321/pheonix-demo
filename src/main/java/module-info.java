module pheonix.smiles.pheonix {
    requires javafx.controls;
    requires javafx.fxml;
            
            requires com.dlsc.formsfx;
                        
    opens pheonix.smiles.pheonix to javafx.fxml;
    exports pheonix.smiles.pheonix;
}