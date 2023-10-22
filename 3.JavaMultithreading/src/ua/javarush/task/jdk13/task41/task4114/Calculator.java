package ua.javarush.task.jdk13.task41.task4114;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Calculator {

    private final Map<String, Operation> operationMap = new HashMap<>();

    public Calculator() {
        Processor processor = new Processor();
        operationMap.put("+", processor::plus);
        operationMap.put("-", processor::minus);
        operationMap.put("*", processor::multiply);
        operationMap.put("/", processor::divide);
    }

    public void calculate(int a, String stringOperation, int b) {
        Operation operation = operationMap.get(stringOperation);
        if (Objects.isNull(operation)) {
            throw new IllegalStateException("no operation registered for '" + stringOperation + "'");
        }
        operation.execute(a, b);
    }
}
