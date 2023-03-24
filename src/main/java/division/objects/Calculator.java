package division.objects;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public int divide(int a, int b) {
        return a / b;
    }
}

