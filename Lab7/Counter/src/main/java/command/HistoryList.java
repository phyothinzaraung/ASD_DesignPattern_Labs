package command;

import java.util.ArrayList;
import java.util.Collection;

public class HistoryList {

    private Collection<Command> commandList = new ArrayList<Command>();
    private Collection<Command> undoList = new ArrayList<Command>();

    public void undo(){
        if(commandList.size() > 0){
            Command commandObject = ((ArrayList<Command>)commandList).get(commandList.size()-1);
            ((ArrayList<Command>)commandList).remove(commandObject);
            commandObject.unExecute();
            undoList.add(commandObject);
        }
    }

    public void redo(){
        if(undoList.size() > 0){
            Command commandObject = ((ArrayList<Command>)commandList).get(commandList.size() - 1);
            commandObject.execute();
            ((ArrayList<Command>)undoList).remove(commandObject);
            commandList.add(commandObject);
        }
    }

    public void addCommand(Command commandObject) {
        commandList.add(commandObject);
    }
}

