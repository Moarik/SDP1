package BehavioralPatterns2.Template;

public abstract class QualityCheck {
    public void checkProduct() {
        checkAppearance();
        checkSpecificCharacteristics();
        finalReport();
    }

    public void performCheck() {
        // Логика проверки качества
        System.out.println("Performing quality check...");
    }


    private void checkAppearance() {
        System.out.println("Checking appearance...");
    }

    protected abstract void checkSpecificCharacteristics();

    private void finalReport() {
        System.out.println("Generating final report...");
    }
}
