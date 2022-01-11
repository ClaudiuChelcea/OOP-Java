package BuilderAndCommandPatterns.commands;

import BuilderAndCommandPatterns.diagram.DiagramComponent;

public class ChangeTextCommand implements DrawCommand {

    DiagramComponent my_component;
    String new_text = "";
    String last_text = "";

    ChangeTextCommand(DiagramComponent new_component, String new_text) {
        my_component = new_component;
        this.last_text = my_component.getColor();
        this.new_text = new_text;
    }

    @Override
    public void execute() {
        my_component.setColor(new_text);
    }

    @Override
    public void undo() {
        my_component.setColor(last_text);
    }
}
