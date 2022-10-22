package seedu.trackascholar.ui;

import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;

/**
 * Prompts an alert window
 */
public class AlertWindow {
    private boolean isConfirmed = false;

    /**
     * Returns official confirmation user reply and displays an alert window
     * @param  message prompted to user
     */
    public boolean display(String message) {
        ButtonType closeButtonType = new ButtonType("Close", ButtonBar.ButtonData.CANCEL_CLOSE);
        ButtonType actionButtonType = new ButtonType("Yes", ButtonBar.ButtonData.YES);
        Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION, message, closeButtonType, actionButtonType);
        // Add CSS ID
        Node closeButton = confirmationAlert.getDialogPane().lookupButton(closeButtonType);
        closeButton.setId("closeBtn");
        confirmationAlert.getDialogPane().getStylesheets().add("view/DarkTheme.css");
        confirmationAlert.showAndWait()
                .filter(response -> response.getButtonData() == ButtonBar.ButtonData.YES)
                .ifPresent(response ->
                        setIsConfirmed());
        return isConfirmed;
    }

    public void setIsConfirmed() {
        this.isConfirmed = true;
    }

}
