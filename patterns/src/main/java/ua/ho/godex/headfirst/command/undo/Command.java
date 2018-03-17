package ua.ho.godex.headfirst.command.undo;

public interface Command {
    public void execute();

    public void undo();
}
