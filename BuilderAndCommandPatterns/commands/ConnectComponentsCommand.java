package BuilderAndCommandPatterns.commands;

import BuilderAndCommandPatterns.diagram.DiagramComponent;

public class ConnectComponentsCommand implements DrawCommand {

    DiagramComponent comp1, comp2;

    ConnectComponentsCommand(DiagramComponent comp1, DiagramComponent comp2) {
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    @Override
    public void execute() {
        this.comp1.connectTo(comp2.getCompId());
    }

    @Override
    public void undo() {

    }
}
