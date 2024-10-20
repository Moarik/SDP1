package BehavioralPatterns2.Visitor;

public interface Visitor {
    void visit(TextFile textFile);
    void visit(ExecutableFile executableFile);
}

