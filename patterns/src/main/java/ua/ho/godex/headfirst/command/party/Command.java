package ua.ho.godex.headfirst.command.party;

public interface Command {
    public void execute();

    public void undo();
}
