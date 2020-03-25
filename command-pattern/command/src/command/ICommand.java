package command;

public interface ICommand {

	void execute();
	
	boolean canExecute();
}
