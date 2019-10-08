package ru.compscicenter.java_2019.lesson_04;

public class AccessDemo {

    //don't ever do like this! this is just for demo purposes!
    int packageField;
    private int privateField;
    public int publicField;
    protected int protectedField;

    public AccessDemo(int packageField, int privateField, int publicField, int protectedField) {
        this.packageField = packageField;
        this.privateField = privateField;
        this.publicField = publicField;
        this.protectedField = protectedField;
    }

    public int getPackageField() {
        return packageField;
    }

    public int getPrivateField() {
        return privateField;
    }

    public int getPublicField() {
        return publicField;
    }

    public int getProtectedField() {
        return protectedField;
    }

    public void setPackageField(int packageField) {
        this.packageField = packageField;
    }

    public void setPrivateField(int privateField) {
        this.privateField = privateField;
    }

    public void setPublicField(int publicField) {
        this.publicField = publicField;
    }

    public void setProtectedField(int protectedField) {
        this.protectedField = protectedField;
    }

    public void changePrivateFieldToWhatIHave(AccessDemo anotherDemo) {
        anotherDemo.privateField = this.privateField;
    }
}
