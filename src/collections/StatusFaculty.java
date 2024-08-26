package collections;

public enum StatusFaculty {
    Active("Активный"), NotActive("Неактивный");
    private String statusName;

    StatusFaculty(String statusName){
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }
}