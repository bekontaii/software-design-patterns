package CarTypes;

import Element.CarElement;
import Visitor.CarVisitor;

public class Truck implements CarElement {
    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
    }
}
