package dev.integration.hub.enuns;

public enum UserRole {

    ASSISTANT("assistant"),

    ANALYST("analyst"),

    ADMIN("admin");

    private String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole(){
        return role;
    }

}
