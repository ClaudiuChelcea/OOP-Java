package BuilderAndCommandPatterns.commands;

import jdk.jshell.Diag;
import BuilderAndCommandPatterns.diagram.DiagramCanvas;
import BuilderAndCommandPatterns.diagram.DiagramComponent;

import java.util.concurrent.atomic.DoubleAccumulator;

public class DrawRectangleCommand implements DrawCommand {
    DiagramCanvas my_canvas;
    static int canvas_size = 0;

    DrawRectangleCommand(DiagramCanvas canvas) {
        my_canvas = canvas;
    }

    @Override
    public void execute() {
        DiagramComponent my_rect = new DiagramComponent();
        my_canvas.addComponent(my_rect);
        canvas_size++;
    }

    @Override
    public void undo() {
        my_canvas.removeComponent(my_canvas.getComponent(canvas_size-1));
        canvas_size--;
    }
}
