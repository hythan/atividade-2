package br.edu.utfpr.atividade2.model.dto;

public class UserDTO {

    private String name;

    private int quantity;

    private Long donationValue;


    public UserDTO(String name, int quantity, Long donationValue) {
        this.name = name;
        this.quantity = quantity;
        this.donationValue = donationValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getDonationValue() {
        return donationValue;
    }

    public void setDonationValue(Long donationValue) {
        this.donationValue = donationValue;
    }
}
