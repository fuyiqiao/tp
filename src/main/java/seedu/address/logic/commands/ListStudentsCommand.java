package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.model.Model.PREDICATE_SHOW_ALL_PERSONS;

import seedu.address.model.Model;

/**
 * Lists all persons in the address book to the user.
 */
public class ListStudentsCommand extends ListCommand {

    public static final String COMMAND_WORD = "students";
    public static final String MESSAGE_USAGE = "list " + COMMAND_WORD
            + ": Lists students.\n"
            + "Example: list " + COMMAND_WORD;
    public static final String MESSAGE_SUCCESS = "Listed all students!";

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredPersonList(PREDICATE_SHOW_ALL_PERSONS);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
