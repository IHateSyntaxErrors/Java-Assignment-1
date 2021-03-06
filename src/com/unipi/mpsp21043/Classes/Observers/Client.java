package com.unipi.mpsp21043.Classes.Observers;

public class Client implements INotifyFeaturePhone {
    private String id;
    private String phoneChoice;
    private boolean receivedPhone;

    public Client(String id, String phoneChoice, boolean receivedPhone) {
        this.id = id;
        this.phoneChoice = phoneChoice;
        this.receivedPhone = receivedPhone;
    }

    // display() method to display
    // the client data
    public void display()
    {
        System.out.println("Client id is: " + id + " "
                + "and client's phone choice is: "
                + phoneChoice);
        System.out.println();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneChoice() {
        return phoneChoice;
    }

    public void setPhoneChoice(String phoneChoice) {
        this.phoneChoice = phoneChoice;
    }

    @Override
    public void sendMessage(String phoneType) {
        System.out.println("A new " + phoneType + " is available!");
    }

    public boolean isReceivedPhone() {
        return receivedPhone;
    }
    public void setReceivedPhone(boolean receivedPhone) {
        this.receivedPhone = receivedPhone;
    }

}
