package experiment;

public class CompilerTest {
    Compiler compiler = new Compiler();
    int passed = 0;
    int failed = 0;

    public static void main(String[] args) {
        experiment.CompilerTest compilerTest = new experiment.CompilerTest();
        compilerTest.testAdd1();
        compilerTest.testAdd2();

        compilerTest.outputResult();
    }

    private void statistics(Boolean result) {
        if (result) {
            passed++;
        } else {
            failed++;
        }
    }

    private void outputResult() {
        System.out.printf("Passed test case number: %d; Failed test case number: %d%n", passed, failed);
    }

    // test case 1
    private void testAdd1() {
        statistics(compiler.add(1, 2) == 3);
    }

    // test case 2
    private void testAdd2() {
        statistics(compiler.add(2, 3) == 4);
    }
}
