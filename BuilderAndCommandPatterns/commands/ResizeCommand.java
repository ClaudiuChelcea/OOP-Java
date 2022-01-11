package BuilderAndCommandPatterns.commands;

import BuilderAndCommandPatterns.diagram.DiagramComponent;

public class ResizeCommand implements DrawCommand {

    DiagramComponent my_component;
    int new_width = 0;
    int new_height = 0;
    int last_width = 0;
    int last_height = 0;

    ResizeCommand(DiagramComponent new_component, int new_width, int new_height) {
        my_component = new_component;
        this.last_height = my_component.getHeight();
        this.last_width = my_component.getWeight();
        this.new_height = new_height;
        this.new_width = new_width;
    }

    @Override
    public void execute() {
        my_component.setHeight(new_height);
        my_component.setWeight(new_width);
    }

    @Override
    public void undo() {
        my_component.setHeight(last_height);
        my_component.setWeight(last_width);
    }
}
