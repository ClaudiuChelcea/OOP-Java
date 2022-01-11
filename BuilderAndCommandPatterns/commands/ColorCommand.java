package BuilderAndCommandPatterns.commands;

import BuilderAndCommandPatterns.diagram.DiagramComponent;

public class ColorCommand implements DrawCommand {

    DiagramComponent my_component;
    String new_color = "";
    String last_color = "";

    ColorCommand(DiagramComponent new_component, String new_color) {
        my_component = new_component;
        this.last_color = my_component.getColor();
        this.new_color = new_color;
    }

    @Override
    public void execute() {
        my_component.setColor(new_color);
    }

    @Override
    public void undo() {
        my_component.setColor(last_color);
    }
}
