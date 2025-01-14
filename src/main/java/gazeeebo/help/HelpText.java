//@@author yueyuu

package gazeeebo.help;


public class HelpText {
    private static final String SEPARATOR_COMMAND = System.lineSeparator()
            + "----------------------------------------------------------------------------------------"
            + "------------------------------------------------------\n"
            + System.lineSeparator();

    private static final String SEPARATOR_PAGE = System.lineSeparator()
            + "_____________________________________________________________________________________________"
            + "____________________________________________________\n"
            + System.lineSeparator();

    public static final String COMMAND_FORMAT =
            "# Command Format #\n"
                    + "Words in UPPER_CASE are the parameters to be supplied by the\n"
                    + "user e.g. in todo TASK_DESCRIPTION, TASK_DESCRIPTION is a\n"
                    + "parameter which can be used as todo eat.\n";

    public static final String COMMANDS_HEADER = "# Commands #";

    //---------------------help--------------------
    private static final  String HEADER_HELP_PAGE = "********** Help page: help **********\n";

    private static final String HELP_FULL =
            "\t[ Viewing the full help page: help ]\n"
                    + "\tCalls out the full help page.\n"
                    + "\tFormat: help\n";

    private static final String HELP_INDIV =
            "\t[ Viewing help for a specific page: help ]\n"
                    + "\tCalls out help for a specific page in the application.\n"
                    + "\tFormat: help PAGE_NAME\n"
                    + "\n"
                    + "\tList of possible commands: \n"
                    + "\t\t- help tasks\n"
                    + "\t\t- help places\n"
                    + "\t\t- help notes\n"
                    + "\t\t- help module\n"
                    + "\t\t- help contacts\n"
                    + "\t\t- help cap\n"
                    + "\t\t- help expenses\n"
                    + "\t\t- help spec\n"
                    + "\t\t- help password - Provides help on how to login and the default password.\n"
                    + "\t\t- help change password \n"
                    + "\t\t- help moduleplanner\n"
                    + "\t\t- help bye\n";

    //------------------------------TASKS-------------------------------------------
    private static final String HEADER_TASKS_PAGE = "********** Tasks page: tasks **********\n"
            + "\n"
            + "Brings you to your tasks page from the main menu page.\n"
            + "In your tasks page, you can add different kinds of tasks to your schedule and view your upcoming "
            + "tasks.\n"
            + "The following commands in this section can only be used in the tasks page.\n"
            + "\n"
            + "How to get to the tasks page: \n"
            + "\t- Type in the command \'tasks\' in the main menu page and press ENTER.\n"
            + "\t- You can only go to the tasks page from the main menu.\n";

    private static final String TODO =
            "\t[ Adding a todo: todo ]\n"
                    + "\tAdds a todo task to the task list.\n"
                    + "\tFormat: todo TASK_DESCRIPTION\n"
                    + "\n"
                    + "\tExamples:\n"
                    + "\t\t- todo eat\n"
                    + "\t\t- todo watch TV\n";

    private static final String DEADLINE =
            "\t[ Adding a deadline: deadline ]\n"
                    + "\tAdds a deadline task to the task list.\n"
                    + "\tFormat: deadline TASK_DESCRIPTION /by YYYY-MM-DD HH:MM:SS\n"
                    + "\n"
                    + "\tExamples:\n"
                    + "\t\t- deadline assignment /by 2019-12-04 12:07:08\n"
                    + "\t\t- deadline watch TV /by 1988-06-27 08:46:37\n";

    private static final String EVENT =
            "\t[ Adding an event: event ]\n"
                    + "\tAdds an event task to the task list.\n"
                    + "\tFormat: event TASK_DESCRIPTION /at YYYY-MM-DD HH:MM:SS-HH:SS:MM\n"
                    + "\n"
                    + "\tExamples: \n"
                    + "\t\t- event party /at 2019-12-04 12:07:08-12:50:00\n"
                    + "\t\t- event project meeting /at 1988-06-27 08:46:37-09:50:10\n";

    private static final String LIST =
            "\t[ Listing out the task list: list ]\n"
                    + "\tList out all the tasks in the task list.\n"
                    + "\tFormat: list\n";

    private static final String DELETE =
            "\t[ Delete task(s): delete ]\n"
                    + "\tDeletes n number of tasks at once from the list or delete all tasks at once.\n"
                    + "\tFormat: delete TASK_NUM1 and TASK_NUM2...OR delete all\n"
                    + "\n"
                    + "\tExamples:\n"
                    + "\t\t- delete 3 and 5\n"
                    + "\t\t- delete 6\n"
                    + "\t\t- delete all\n";

    private static final String DONE =
            "\t[ Set a task as done: done ]\n"
                    + "\tMarks a task as done.\n"
                    + "\tFormat: done TASK_NUM\n"
                    + "\n"
                    + "\tExamples:\n"
                    + "\t\t- done 1\n"
                    + "\t\t- done 6\n";

    private static final String TASKS_FIND =
            "\t[ Find tasks based on a keyword: find ]\n"
                    + "\tSearches for tasks based on a specified keyword.\n"
                    + "\tFormat: find KEYWORD\n"
                    + "\n"
                    + "\tExamples:\n"
                    + "\t\t- find read\n"
                    + "\t\t- find eat\n";

    private static final String SCHEDULE_DAILY =
            "\t[ Viewing the schedule for a day: scheduleDaily ]\n"
                    + "\tLists out your schedule and your notes for the specified date. \n"
                    + "\tFormat: scheduleDaily YYYY-MM-DD\n"
                    + "\n"
                    + "\tExamples:\n"
                    + "\t\t- scheduleDaily 2019-08-09\n"
                    + "\t\t- scheduleDaily 2022-10-26\n";

    private static final String SCHEDULE_WEEKLY =
            "\t[ Viewing the schedule for a week: scheduleWeekly ]\n"
                    + "\tLists out your schedule and your notes for the specified week. \n"
                    + "\tFormat: scheduleWeekly YYYY-MM-DD YYYY-MM-DD\n"
                    + "\n"
                    + "\tFormat details:\n"
                    + "\t\t- The first date in the format above must be a Monday and the second date must be a "
                    + "Sunday.\n"
                    + "\t\t- The first date must be before the second date.\n"
                    + "\t\t- The number of days between the two dates must be 7.\n"
                    + "\n"
                    + "\tExamples: \n"
                    + "\t\t- scheduleWeekly 2019-10-07 2019-10-13\n"
                    + "\t\t- scheduleWeekly 2019-09-02 2019-09-08\n";

    private static final String SCHEDULE_MONTHLY =
            "\t[ Viewing the schedule for a month: scheduleMonthly ]\n"
                    + "\tLists out your schedule and your notes for the specified month. \n"
                    + "\tFormat: scheduleMonthly YYYY-MM\n"
                    + "\n"
                    + "\tExamples: \n"
                    + "\t\t- scheduleMonthly 2020-10\n"
                    + "\t\t- scheduleMonthly 2019-09\n";

    private static final String DO_WITHIN_PERIOD =
            "\t[ Adding a 'do-within-a-period' task: /between ]\n"
                    + "\tAdding tasks that need to be done within a certain period to the list.\n"
                    + "\tFormat: TASK_DESCRIPTION /between YYYY-MM-DD and YYYY-MM-DD\n"
                    + "\n"
                    + "\tExamples: \n"
                    + "\t\t- collect book /between 2019-12-04 and 2019-12-05\n"
                    + "\t\t- order food /between 2017-12-04 and 2017-12-05 \n";

    private static final String TENTATIVE_EVENT_ADD =
            "\t[ Adding a Tentative Event base on a keyword: tentative ]\n"
                    + "\tCreating a tentative event with description of the event.\n"
                    + "\tFormat: tentative TASK_DESCRIPTION\n"
                    + "\n"
                    + "\tExamples:\n"
                    + "\t\t- Tentative return book\n"
                    + "\n"
                    + "\tKey in all possible time slots, ends input with a keyword: /\n"
                    + "\tFormat: YYYY-MM-DD HH:MM:SS-HH:MM:SS\n"
                    + "\t        YYYY-MM-DD HH:MM:SS-HH:MM:SS\n"
                    + "\t        /\n"
                    + "\n"
                    + "\tExamples:\n"
                    + "\t\t- 2019-08-04 05:04:03-01:01:01\n"
                    + "\t\t  2019-09-18 07:11:44-10:10:10\n"
                    + "\t\t  /\n"
                    + "\n"
                    + "\tEnsure your creation with a keyword: yes\n"
                    + "\tExample: yes\n";

    private static final String TENTATIVE_EVENT_CONFIRM =
            "\t[ Confirming a Tentative Event base on a keyword: confirm ]\n"
                    + "\tConfirming one if the timeslots of the exact tentative event with its INDEX.\n"
                    + "\tFormat: confirm INDEX\n"
                    + "\n"
                    + "\tExample: \n"
                    + "\t\t- confirm \n"
                    + "\n"
                    + "\tChoosing which time slot to confirm with its SEQUENCE_NUMBER\n"
                    + "\tFormat: SEQUENCE_NUMBER\n"
                    + "\n"
                    + "\tExample:\n"
                    + "\t\t- 1\n"
                    + "\n"
                    + "\tEnsure your confirmation with a keyword: yes\n"
                    + "\tExample: yes\n";

    private static final String TASKS_EDIT =
            "\t[ Editing a task: edit ]\n"
                    + "\tEdit task with task's INDEX.\n"
                    + "\tFormat: edit INDEX\n"
                    + "\n"
                    + "\tExample:\n"
                    + "\t\t- edit 1    \n"
                    + "\n"
                    + "\tChoose time/description/both to edit\n"
                    + "\tFormat: time\n"
                    + "\n"
                    + "\tExample:\n"
                    + "\t\t- 2019-10-10 10:10:10\n";

    private static final String FIXED_DURATION_TASK =
            "\t[ Adding a task with a fixed duration: /require ]\n"
                    + "\tAdding a task takes a fixed amount of time but does not have a fixed start/end time "
                    + "to the list.\n"
                    + "\tFormat: TASK_DESCRIPTION /require FIXED_AMOUNT_OF_TIME\n"
                    + "\n"
                    + "\tExample: \n"
                    + "\t\t- reading the sales report /require 2 hours\n"
                    + "\t\t- project meeting /require 4 hours\n";

    private static final String CATEGORIZE_TASKS =
            "\t[ Categorize tasks: CATEGORY_NAME ]\n"
                    + "\tList out all the categorized tasks in the category task list.\n"
                    + "\tFormat: CATEGORY_NAME list\n"
                    + "\n"
                    + "\tExample:\n"
                    + "\t\t- event list\n"
                    + "\t\t- deadline list\n"
                    + "\t\t- todo list\n";

    private static final String CALENDAR_VIEW_MONTHLY =
            "\t[ View current month in a calendar view: calendar monthly view ]\n"
                    + "\tShows the dates and current month in a calendar view.\n"
                    + "\tDates with tasks will be demarcated with a ' * '.\n"
                    + "\tCurrent date will be demarcated between ' | '.\n"
                    + "\tFormat: calendar monthly view\n";

    private static final String CALENDAR_VIEW_ANNUAL =
            "\t[ View current year in a calendar view: calendar annual view ]\n"
                    + "\tShows the dates and months in a calendar view.\n"
                    + "\tDates with tasks will be demarcated with a ' * '.\n"
                    + "\tCurrent date will be demarcated between ' | '.\n"
                    + "\tFormat: calendar annual view\n";

    private static final String UNDONE =
            "\t[ Set a 'done' task as undone: undone ]\n"
                    + "\tMarks a task as undone.\n"
                    + "\tFormat: undone TASK_NUM\n"
                    + "\n"
                    + "\tExamples:\n"
                    + "\t\t- undone 1\n"
                    + "\t\t- undone 6\n";

    private static final String DONE_LIST =
            "\t[ See all the tasks that are marked as done: done list ]\n"
                    + "\tList out all the tasks that are done in a list\n"
                    + "\tFormat: done list\n";

    private static final String DO_AFTER_TASK =
            "\t[ Adding a do-after task: /after ]\n"
                    + "\tAdd a follow-up task when a task is marked as done.\n"
                    + "\tFormat: FOLLOW_UP_TASK /after COMPLETED_TASK\n"
                    + "\t\n"
                    + "\tExamples:\n"
                    + "\t\t- return book /after read book\n";

    private static final String SNOOZE =
            "\t[ Snooze a task based on a keyword: reschedule ]\n"
                    + "\tSnooze a task's timeline with task's INDEX\n"
                    + "\tFormat: reschedule INDEX\n"
                    + "\n"
                    + "\tExample: \n"
                    + "\t\t- reschedule 1\n"
                    + "\n"
                    + "\tKey in your new timeline with the DATA\n"
                    + "\tFormat: YYYY-MM-DD HH:MM:SS\n"
                    + "\n"
                    + "\tExample: \n"
                    + "\t\t- 1998-04-05 08:09:14\n"
                    + "\n"
                    + "\tEnsure your rescheduling with a keyword: yes\n"
                    + "\t\n"
                    + "\tExample: \n"
                    + "\t\t- Yes\n";

    private static final String RESCHEDULE =
            "\t[ Reschedule a task based on a keyword: snooze ]\n"
                    + "\tReschedule a task's timeline with task's INDEX\n"
                    + "\tFormat: snooze INDEX\n"
                    + "\n"
                    + "\tExample:\n"
                    + "\t\t- snooze 1    \n"
                    + "\n"
                    + "\tKey in how much time you want to prolong\n"
                    + "\tFormat:  Y M D H\n"
                    + "\n"
                    + "\tExample: \n"
                    + "\t\t- 1 2 3 4\n";

    private static final String RECURRING_TASK =
            "\t[ Create recurring tasks based on a keyword: weekly/monthly/yearly ]\n"
                    + "\tA recurring task has any of the keywords.\n"
                    + "\tFormat: TASK_DESCRIPTION\n"
                    + "\n"
                    + "\tExample:\n"
                    + "\t\t- event weekly seminar /at 2019-10-10 10:10:10-11:11:11\n"
                    + "\n"
                    + "\tFormat: done INDEX\n"
                    + "\tExample:\n"
                    + "\t\t- done 1\n";

    private static final String UNDONE_LIST =
            "\t[ See all the tasks that are marked as undone: undone list ]\n"
                    + "\tList out all the tasks that are undone in a list\n"
                    + "\tFormat: undone list\n";

    private static final String TAGGING =
            "\t[ Tagging tasks: #TAG_NAME ]\n"
                    + "\tTag tasks using the hashtag, and see the same tagged tasks in a list\n"
                    + "\tFormat: #TAG_NAME\n"
                    + "\n"
                    + "\tExample:\n"
                    + "\t\tTo tag:\n"
                    + "\t\t\t- todo running #fit\n"
                    + "\t\t\t- event basketball match #fit /at 2019-04-05 12:00:00-14:00:00\n"
                    + "\t\t\t- deadline claim voucher #food /by 2019-04-03 13:00:00\n"
                    + "\n"
                    + "\t\tTo see the tasks with the same tags:\n"
                    + "\t\t\t- #fit\n"
                    + "\t\t\t- #food\n";

    private static final String UNDO_COMMANDS =
            "\t[ Undo commands: undo ]\n"
                    + "\tUndo previous tasks commands\n"
                    + "\tFormat: undo\n"
                    + "\n"
                    + "\tPrevious task commands that you can undo:\n"
                    + "\t\t- EventCommand\n"
                    + "\t\t- TodoCommand\n"
                    + "\t\t- DeadlineCommand\n"
                    + "\t\t- TentativeEventCommand\n"
                    + "\t\t- DoneCommand\n"
                    + "\t\t- DeleteCommand\n"
                    + "\t\t- DoAfterCommand\n"
                    + "\t\t- TimeBoundCommand\n"
                    + "\t\t- FixDurationCommand\n"
                    + "\t\t- ConfirmTentativeCommand\n"
                    + "\t\t- UndoneCommand\n";

    private static final String PERIOD_NOTE_ADD =
            "\t[ Adding a note to a particular day/week/month: addNote ]\n"
                    + "\tAdds a note to the note section of the specified day, week or month. \n"
                    + "\n"
                    + "\tFormat (day):  addNote day YYYY-MM-DD\n"
                    + "\tFormat (week): addNote week YYYY-MM-DD \n"
                    + "\tFormat (month): addNote month YYYY-MM\n"
                    + "\n"
                    + "\tFormat details: \n"
                    + "\t\t- The date specified in Format (week) above has to be a Monday.\n"
                    + "\n"
                    + "\tSteps for adding a note (to a particular week):\n"
                    + "\t\t1. Type in the command in the format specified above.\n"
                    + "\t\t\ta. Eg. addNote week 2019-10-14\n"
                    + "\t\t2. Press ENTER.\n"
                    + "\t\t3. Type in the note you want to add on that new line.\n"
                    + "\t\t\ta. Eg. tons of homework for this week :(\n"
                    + "\t\t4. Press ENTER.\n"
                    + "\n"
                    + "\tExamples for command format: \n"
                    + "\t\t- Adding a note to a particular day: addNote day 2020-10-11\n"
                    + "\t\t- Adding a note to a particular week: addNote week 2019-10-14\n"
                    + "\t\t- Adding a note to a particular month: addNote month 2019-01\n";

    private static final String PERIOD_NOTE_EDIT =
            "\t[ Editing a note for a particular day/week/month: editNote ]\n"
                    + "\tEdits an existing note in the note section of the specified day, week or month. \n"
                    + "\n"
                    + "\tFormat (day):  editNote day YYYY-MM-DD NOTE_NUMBER\n"
                    + "\tFormat (week): editNote week YYYY-MM-DD NOTE_NUMBER\n"
                    + "\tFormat (month): editNote month YYYY-MM NOTE_NUMBER\n"
                    + "\n"
                    + "\tFormat details: \n"
                    + "\t\t- NOTE_NUMBER starts from index 1.\n"
                    + "\t\t- The date specified in Format (week) above has to be a Monday.\n"
                    + "\n"
                    + "\tSteps for editing a note:\n"
                    + "\t\t1. Type in the command in the format specified above.\n"
                    + "\t\t\ta. Eg. editNote week 2019-10-14 1\n"
                    + "\t\t2. Press ENTER.\n"
                    + "\t\t3. Type in the edited version of the note on that new line.\n"
                    + "\t\t\ta. Eg. less homework for this week :)\n"
                    + "\t\t4. Press ENTER.\n"
                    + "\n"
                    + "\tExamples for command format: \n"
                    + "\t\t- Editing a note for a particular day: editNote day 2020-10-11 1\n"
                    + "\t\t- Editing a note for a particular week: editNote week 2019-10-14 3\n"
                    + "\t\t- Editing a note for a particular month: editNote month 2019-01 5\n";

    private static final String PERIOD_NOTE_DELETE =
            "\t[ Deleting a note for a particular day/week/month: deleteNote ]\n"
                    + "\tDeletes an existing note in the note section of the specified day, week or month. \n"
                    + "\n"
                    + "\tFormat (day):  deleteNote day YYYY-MM-DD NOTE_NUMBER\n"
                    + "\tFormat (week): deleteNote week YYYY-MM-DD NOTE_NUMBER\n"
                    + "\tFormat (month): deleteNote month YYYY-MM NOTE_NUMBER\n"
                    + "\n"
                    + "\tFormat details: \n"
                    + "\t\t- NOTE_NUMBER starts from index 1.\n"
                    + "\t\t- The date specified in Format (week) above has to be a Monday.\n"
                    + "\n"
                    + "\tSteps for deleting a note (assigned to a day):\n"
                    + "\t\t1. Type in the command in the format specified above.\n"
                    + "\t\t\ta. Eg. deleteNote week 2019-10-14 1\n"
                    + "\t\t2. Press ENTER.\n"
                    + "\n"
                    + "\tExamples for command format: \n"
                    + "\t\t- Deleting a note that was assigned to a particular day: deleteNote day 2020-10-11 1\n"
                    + "\t\t- Deleting a note that was assigned to a particular week: deleteNote week 2019-10-14 3\n"
                    + "\t\t- Deleting a note that was assigned to a particular month: deleteNote month 2019-01 5\n";

    private static final String PERIOD_NOTE_LIST =
            "\t[ Listing out all notes for a particular day/week/month: listNote ]\n"
                    + "\tLists out all the notes in the note section of the specified day, week or month. \n"
                    + "\n"
                    + "\tFormat (day):  listNote day YYYY-MM-DD \n"
                    + "\tFormat (week): listNote week YYYY-MM-DD \n"
                    + "\tFormat (month): listNote month YYYY-MM \n"
                    + "\n"
                    + "\tFormat details: \n"
                    + "\t\t- The date specified in Format (week) above has to be a Monday.\n"
                    + "\n"
                    + "\tSteps for listing out notes (for a particular day):\n"
                    + "\t\t1. Type in the command in the format specified above.\n"
                    + "\t\t\ta. Eg. listNote day 2020-09-11 \n"
                    + "\t\t2. Press ENTER.\n"
                    + "\n"
                    + "\tExamples for command format: \n"
                    + "\t\t- Listing the notes for a particular day: "
                    + "listNote day 2020-10-23\n"
                    + "\t\t- Listing the notes for a particular week: "
                    + "listNote week 2019-10-14\n"
                    + "\t\t- Listing the notes for a particular month: "
                    + "listNote month 2019-01\n";

    //-------------------------------------------------places--------------------------------------------

    private static final String HEADER_PLACES_PAGE = "********** Places page: places **********\n"
            + "\n"
            + "A function to locate places and rooms in NUS School of Computing.\n"
            + "In the places page, you can search for a place that you want to find or you can add and \n"
            + "delete places and locations to the current list. \n"
            + "\n"
            + "How to get to places page: \n"
            + "\t- Type in the command \'places\' in the main menu page and press ENTER.\n"
            + "\t- You can only go to the places page from the main menu.\n";

    private static final String PLACES_ADD =
            "\t[ Adds and stores a new place and location. ]\n"
                    + "\n"
                    + "\tFormat: add-room,location\n"
                    + "\n"
                    + "\tSteps for adding a place:\n"
                    + "\t\t1. Type in the command add-room,location in the above format. Eg. LT19,COM2 Level 1\n"
                    + "\t\t2. Press ENTER.\n"
                    + "\t\t3. Alternatively, you can input add or the index of the add command, 1.\n"
                    + "\t\t4. The system will prompt you to enter the room and location in this format, "
                    + "room,location.\n";

    private static final String PLACES_FIND =
            "\t[ Finding a place in NUS School of Computing (SOC): find-place ]\n"
                    + "\tGives you the location of a specific place in SOC.\n"
                    + "\n"
                    + "\tFormat : find-place\n"
                    + "\n"
                    + "\tFormat details: \n"
                    + "\t\t- place is the name of the place you want to find.\n"
                    + "\n"
                    + "\tSteps for finding a place:\n"
                    + "\t\t1. Type in the command in the format specified above. Eg. find-LT19\n"
                    + "\t\t2. Press ENTER.\n"
                    + "\t\t3. Alternatively, type in find or the index for find command, 2 and press ENTER.\n"
                    + "\t\t4. Press ENTER.\n"
                    + "\t\t5. The system will prompt you to enter the place you wish to find.\n";

    private static final String PLACES_LIST =
            "\t[ Listing all places in NUS School of Computing (SOC): list ]\n"
                    + "\tLists out all places in SOC.\n"
                    + "\n"
                    + "\tFormat :  list"
                    + "\tSteps for list command:\n"
                    + "\t\t1. Type in list and press ENTER.\n"
                    + "\t\t2. Alternatively, type the index of list command, 4 and press ENTER.\n";

    private static final String PLACES_DELETE =
            "\t[ Deleting a place in the list: delete-place ]\n"
                    + "\tDeletes an existing place list of places.\n"
                    + "\n"
                    + "\tFormat :  delete-place\n"
                    + "\n"
                    + "\tFormat details: \n"
                    + "\t\t- place is the name of the place you want to delete\n"
                    + "\n"
                    + "\tSteps for deleting a place:\n"
                    + "\t\t1. Type in the command in the format specified above. Eg. delete-LT19\n"
                    + "\t\t2. Press ENTER.\n"
                    + "\t\t3. Alternatively, you can input delete or the index of the delete command, 3.\n"
                    + "\t\t4. The system will prompt you to enter the name of the room you wish to delete.\n";

    private static final String PLACES_UNDO =
            "\t[ Undo previous places command: undo]\n"
                    + "\tUndo the previous places command.\n"
                    + "\tCommands that can be undone:\n"
                    + "\t\t- add\n"
                    + "\t\t- delete\n"
                    + "\n"
                    + "\tFormat :  undo"
                    + "\tSteps for undo command:\n"
                    + "\t\t1. Type in undo and press ENTER.\n"
                    + "\t\t2. Alternatively, type the index of undo command, 5 and press ENTER.\n";

    //------------------------------------------------------notes----------------------------------
    private static final String HEADER_NOTES_PAGE = "********** Notes page: notes **********\n"
            + "\n"
            + "Brings you to your notes page from the main menu page. \n"
            + "In your notes page, you can specify your goal and also record information about your modules. "
            + "\n"
            + "How to go to your notes page: \n"
            + "\t- Type in the command \'notes\' or \'9\' in the main menu page and press ENTER.\n"
            + "\t- You can only go to the notes page from the main menu.\n";

    private static final String NOTES_VIEW =
            "\t[ View goal and list of modules: view ]\n"
                    + "\tLists out your goal and the list of modules you have added.\n"
                    + "\n"
                    + "\tFormat: view\n";

    private static final String NOTES_EDIT_GOAL =
            "\t[ Edit goal: edit /n ]\n"
                    + "\tEdits your existing goal to the new goal you specify.\n"
                    + "\n"
                    + "\tFormat: edit /n NEW_GOAL\n"
                    + "\n"
                    + "\tFormat details:\n"
                    + "\t\t- The white space between /n and NEW_GOAL is optional.\n"
                    + "\tExamples:\n"
                    + "\t\t- edit /n i want to be a rock star\n"
                    + "\t\t- edit /nto become a CEO\n";

    private static final String NOTES_ADD_MODULE =
            "\t[ Add a module: add /n ]\n"
                    + "\tAdds a module to your note page.\n"
                    + "\n"
                    + "\tFormat: add /n MODULE_NAME\n"
                    + "\n"
                    + "\tFormat details:\n"
                    + "\t\t- The white space between /n and MODULE_NAME is optional.\n"
                    + "\n"
                    + "\tConstraints:\n"
                    + "\t\t- You cannot add a module with the same name as an existing module.\n"
                    + "\t\t- You have the freedom to name your module whatever you want  "
                    + "ie. the MODULE_NAME does not need to be what it is called by NUS.\n"
                    + "\n"
                    + "\tExamples: \n"
                    + "\t\t- add /n annoying module\n"
                    + "\t\t- add /n cs1231\n"
                    + "\t\t- add /nSoftware Engineering & Object-Oriented Programming ";

    private static final String NOTES_DELETE_MODULE =
            "\t[ Delete a module: delete /n ]\n"
                    + "\tDeletes a module from your note page.\n"
                    + "\n"
                    + "\tFormat: delete /n MODULE_NAME\n"
                    + "\n"
                    + "\tFormat details:\n"
                    + "\t\t- The white space between /n and MODULE_NAME is optional.\n"
                    + "\n"
                    + "\tExamples: \n"
                    + "\t\t- delete /n annoying module\n"
                    + "\t\t- delete /n cs1231\n"
                    + "\t\t- delete /nSoftware Engineering & Object-Oriented Programming\n";

    private static final String HEADER_MODULE_PAGE = "********** Module page: module **********\n"
            + "\n"
            + "Brings you to a module page, which contains the notes for that module, for the module you specify. \n"
            + "The notes for the module are grouped into 2 categories, namely assessments and miscellaneous.\n"
            + "\n"
            + "Format: module /n MODULE_NAME\n"
            + "Format details:\n"
            + "\t- The white space between /n and MODULE_NAME is optional.\n"
            + "\n"
            + "Constraints:\n"
            + "\t- You can only go to a module page from the note page.\n"
            + "\t\t-- ie. You have to first go to your note page and then type in module /n MODULE_NAME \n"
            + "\t\t   in your note page to be able to go to a module page.\n"
            + "\n"
            + "Examples: \n"
            + "\t- module /n annoying module\n"
            + "\t- module /n cs1231\n"
            + "\t- module /nSoftware Engineering & Object-Oriented Programming\n";

    private static final String MODULE_VIEW =
            "\t[ View the module's notes: view ]\n"
                    + "\tShows you the notes you have for the module.\n"
                    + "\tFormat: view\n";

    private static final String MODULE_EDIT_MODULE_NAME =
            "\t[ Edit the module's name: edit mod /n ]\n"
                    + "\tEdit the module's name: edit mod /n\n"
                    + "\tEdits the name of the module.\n"
                    + "\n"
                    + "\tFormat: edit mod /n NEW_NAME\n"
                    + "\n"
                    + "\tFormat details:\n"
                    + "\t\t- The white space between /n and NEW_NAME is optional.\n"
                    + "\n"
                    + "\tExamples: \n"
                    + "\t\t- edit mod /n A+ module\n"
                    + "\t\t- edit mod /n CS1231\n"
                    + "\t\t- edit mod /nSoftware Engineering & Object-Oriented Programming\n";

    private static final String MODULE_ADD_ASSMT =
            "\t[ Add an assessment: add assmt /n /a ]\n"
                    + "\tAdds an assessment to the module.\n"
                    + "\n"
                    + "\tFormat: add assmt /n NAME /a WEIGHTAGE\n"
                    + "\n"
                    + "\tFormat details:\n"
                    + "\t\t- The white space between /n and NAME is optional.\n"
                    + "\t\t- The white space between /a and WEIGHATGE is optional.\n"
                    + "\n"
                    + "\tExamples: \n"
                    + "\t\t- add assmt /n group project /a 47\n"
                    + "\t\t- add assmt /npresentation /a20\n";

    private static final String MODULE_EDIT_ASSMT =
            "\t[ Edit an assessment name: edit assmt /n /a ]\n"
                    + "\tEdits the name of the specified assessment.\n"
                    + "\n"
                    + "\tFormat: edit assmt /n INDEX /a NEW_NAME\n"
                    + "\n"
                    + "\tFormat details:\n"
                    + "\t\t- The white space between /n and INDEX is optional.\n"
                    + "\t\t- The white space between /a and NEW_NAME is optional.\n"
                    + "\t\t- INDEX refers to the index of the assessment in the list of "
                    + "assessments when you use the view command.\n"
                    + "\n"
                    + "\tExamples: \n"
                    + "\t\t- edit assmt /n 4 /a project\n"
                    + "\t\t- edit assmt /n2 /afinal exam\n";

    private static final String MODULE_EDIT_WEIGHTAGE =
            "\t[ Edit an assessment's weightage: edit weight /n /a ]\n"
                    + "\tEdits the weightage of the specified assessment.\n"
                    + "\n"
                    + "\tFormat: edit weight /n INDEX /a NEW_WEIGHTAGE\n"
                    + "\n"
                    + "\tFormat details:\n"
                    + "\t\t- The white space between /n and INDEX is optional.\n"
                    + "\t\t- The white space between /a and WEIGHTAGE is optional.\n"
                    + "\t\t- INDEX refers to the index of the assessment in the list of assessments "
                    + "when you use the view command.\n"
                    + "\t\t- WEIGHTAGE is in percentage eg. if you specify it as 30, it will be 30%\n"
                    + "\n"
                    + "\tExamples: \n"
                    + "\t\t- edit weight /n 4 /a 30\n"
                    + "\t\t- edit weight /n2 /a49\n";

    private static final String MODULE_DELETE_ASSMT =
            "\t[ Delete an assessment: delete assmt /n ]\n"
                    + "\tDeletes the specified assessment.\n"
                    + "\n"
                    + "\tFormat: delete assmt /n INDEX\n"
                    + "\n"
                    + "\tFormat details:\n"
                    + "\t\t- The white space between /n and INDEX is optional.\n"
                    + "\t\t- INDEX refers to the index of the assessment in the list of assessments when "
                    + "you use the view command.\n"
                    + "\n"
                    + "\tExamples: \n"
                    + "\t\t- delete assmt /n 4\n"
                    + "\t\t- delete assmt /n2\n";

    private static final String MODULE_ADD_MSC =
            "\t[ Add a miscellaneous information: add msc /n ]\n"
                    + "\tAdds a miscellaneous information to the module.\n"
                    + "\n"
                    + "\tFormat: add msc /n DESCRIPTION\n"
                    + "\n"
                    + "\tFormat details:\n"
                    + "\t\t- The white space between /n and DESCRIPTION is optional.\n"
                    + "\n"
                    + "\tExamples: \n"
                    + "\t\t- add msc /n a heavy module\n"
                    + "\t\t- add msc /nwear covered shoes for lab\n";

    private static final String MODULE_EDIT_MSC =
            "\t[ Edit a miscellaneous information: edit msc /n /a ]\n"
                    + "\tEdits the specified miscellaneous information.\n"
                    + "\n"
                    + "\tFormat: edit msc /n INDEX /a NEW_DESCRIPTION\n"
                    + "\n"
                    + "\tFormat details:\n"
                    + "\t\t- The white space between /n and INDEX is optional.\n"
                    + "\t\t- The white space between /a and NEW_DESCRIPTION is optional.\n"
                    + "\t\t- INDEX refers to the index of the assessment in the list of miscellaneous "
                    + "information when you use the view command.\n"
                    + "\n"
                    + "\tExamples: \n"
                    + "\t\t- edit msc /n 4 /a no webcast for this mod\n"
                    + "\t\t- edit msc /n2 /alecturer starts lecture exactly at 6pm\n";

    private static final String MODULE_DELETE_MSC =
            "\t[ Delete a miscellaneous information: delete msc /n ]\n"
                    + "\tDeletes the specified miscellaneous information.\n"
                    + "\n"
                    + "\tFormat: delete msc /n INDEX\n"
                    + "\n"
                    + "\tFormat details:\n"
                    + "\t\t- The white space between /n and INDEX is optional.\n"
                    + "\t\t- INDEX refers to the index of the assessment in the list of "
                    + "miscellaneous information when you use the view command.\n"
                    + "\n"
                    + "\tExamples: \n"
                    + "\t\t- delete msc /n 4\n"
                    + "\t\t- delete msc /n2\n";

    private static final String MODULE_VIEW_COMMANDS =
            "\t[ View the list of possible commands for the module page: commands ]\n"
                    + "\tShows you the possible things you can do on the module page.\n"
                    + "\n"
                    + "\tFormat: commands\n";

    private static final String MODULE_ESC =
            "\t[ Go back to the note page: esc ]\n"
                    + "\tBrings you back to the note page from the module page.\n"
                    + "\n"
                    + "\tFormat: esc";

    private static final String NOTES_VIEW_COMMANDS =
            "\t[ View the list of possible commands for the notes page: commands ]\n"
                    + "\tShows you the possible things you can do on the notes page.\n"
                    + "\n"
                    + "\tFormat: commands\n";

    private static final String NOTES_ESC =
            "\t[ Go back to the main page: esc ]\n"
                    + "\tBrings you back to the main page from the note page.\n"
                    + "\n"
                    + "\tFormat: esc";

    //---------------------------------------------------contacts---------------------------
    private static final String HEADER_CONTACTS_PAGE = "********** Contacts page: contacts **********\n"
            + "\n"
            + "Function to store contacts.\n"
            + "Enter the contacts page.\n"
            + "\n"
            + "Format: contacts\n"
            + "\n"
            + "Example:\n"
            + "\t- contacts\n";

    private static final String CONTACT_ADD =
            "\t[ Adding a new contact name and number ]\n"
                    + "\tAdds and stores a new name and number.\n"
                    + "\n"
                    + "\tFormat: add name,number\n"
                    + "\n"
                    + "\tExample:\n"
                    + "\t\t- Add jason,96251922\n";

    private static final String CONTACT_FIND =
            "\t[ Finding a contact ]\n"
                    + "\tList out the contact names that have the keyword.\n"
                    + "\n"
                    + "\tFormat: find name\n"
                    + "\n"
                    + "\tExample:\n"
                    + "\t\t- find Jason\n";

    private static final String CONTACT_LIST =
            "\t[ Listing all contacts ]\n"
                    + "\tLists all contacts.\n"
                    + "\n"
                    + "\tFormat: list\n"
                    + "\n"
                    + "\tExample:\n"
                    + "\t\t- list \n";

    private static final String CONTACT_DELETE =
            "\t[ Deleting a contact in the list ]\n"
                    + "\tDeletes an existing contact in the list.\n"
                    + "\n"
                    + "\tFormat: find name\n"
                    + "\n"
                    + "\tExample:\n"
                    + "\t\t- delete Jason\n";

    private static final String CONTACT_COMMANDS =
            "\t[ View commands in Contact page ]\n"
                    + "\tView commands in contact page.\n\n"
                    + "\tFormat: commands\n\n"
                    + "\tExample:\n"
                    + "\t\t- commands\n";

    private  static final String CONTACT_UNDO =
            "\t[ Undo previous contact command ]\n"
                    + "\tUndo the previous contact command.\n"
                    + "\tCommands that can be undone:\n"
                    + "\t\t- add\n"
                    + "\t\t- delete\n"
                    + "\n"
                    + "\tFormat :  undo\n";
    //--------------------------------------CAP-----------------------------------------------
    private static final String HEADER_CAP_PAGE = "********** CAP page: cap **********\n"
            + "\n"
            + "A function to calculate the CAP of modules and to store module's sem number, code, credit and grade.\n"
            + "\n"
            + "Format: cap\n"
            + "\n"
            + "Example:\n"
            + "\t- cap\n";

    private static final String CAP_ADD_MODULE =
            "\t[ Adding a new module's sem number, code, credit, and grade ]\n"
                    + "\tCall out the add feature and input the required module information. There are 3 ways\n"
                    + "\tof calling out add feature:\n"
                    + "\n"
                    + "\t1st way: \n"
                    + "\t\tStep 1: 1\n"
                    + "\t\tStep 2: semester number,module's code,module's credit,module's grade\n"
                    + "\n"
                    + "\t2nd way: \n"
                    + "\t\tStep 1: add\n"
                    + "\t\tStep 2: semester number,module's code,module's credit,module's grade\n"
                    + "\n"
                    + "\t3rd way:\n"
                    + "\t\tStep 1: add semester number,module's code,module's credit,module's grade\n";

    private static final String CAP_FIND_MODULE =
            "\t[ Finding a module(s) ]\n"
                    + "\tFinds all the modules by module's code. There are 2 ways of calling out the find feature:\n"
                    + "\n"
                    + "\t1st way: \n"
                    + "\t\tStep 1: 2\n"
                    + "\t\tStep 2: module's code\n"
                    + "\n"
                    + "\t2nd way: \n"
                    + "\t\tStep 1: find\n"
                    + "\t\tStep 2: module's code\n"
                    + "\n"
                    + "\t3rd way:\n"
                    + "\t\tStep 1: find module's code\n";

    private static final String CAP_LIST_MODULE =
            "\t[ Listing modules ]\n"
                    + "\tCall out the list feature\n"
                    + "\n"
                    + "\t1st way: \n"
                    + "\t\tStep 1: 4\n"
                    + "\t\tStep 2: semester's number\n"
                    + "\n"
                    + "\t2nd way: \n"
                    + "\t\tStep 1: list\n"
                    + "\t\tStep 2: semester's number\n"
                    + "\n"
                    + "\t3rd way:\n"
                    + "\t\tStep 1: list semester's number\n";

    private static final String CAP_DELETE_MODULE =
            "\t[ Deleting a module in the list ]\n"
                    + "\t1st way: \n"
                    + "\t\tStep 1: 3\n"
                    + "\t\tStep 2: module's code\n"
                    + "\n"
                    + "\t2nd way: \n"
                    + "\t\tStep 1: delete\n"
                    + "\t\tStep 2: module's code\n"
                    + "\n"
                    + "\t3rd way:\n"
                    + "\t\tStep 1: add semester number,module's code,module's credit,module's grade\n";

    private static final String CAP_COMMANDS =
            "\t[ Show commands in CAP Page ]\n"
                    + "\tShows what commands can do in CAP page.\n"
                    + "\n"
                    + "\t1st way: \n"
                    + "\t\tStep 1: 5\n"
                    + "\n"
                    + "\t2nd way: \n"
                    + "\t\tStep 1: commands\n";

    //------------------------------------------expenses-------------------------------
    private static final String HEADER_EXPENSES_PAGE = "********** Expenses page: expenses **********\n"
            + "\n"
            + "Brings you to your expenses page from the main menu page.\n"
            + "In your expenses page, you can record your expenses to help them manage "
            + "their finances and see what they spend their money on.\n"
            + "How to go to your expenses page: \n"
            + "\t- Type in the command \'expenses\' in the main menu page and press ENTER.\n"
            + "\t- You can only go to the note page from the main menu.\n";

    private static final String EXP_LIST = "\t[ List all existing expenses: list ]\n"
            + "\tLists out your expenses you have added.\n"
            + "\n"
            + "\tFormat: list\n"
            + "\n"
            + "\tExample:\n"
            + "\t\t- list\n";

    private static final String EXP_FIND = "\t[ Finding the record of expenses on a certain date: find DATE ]\n"
            + "\tFinds all expenses recorded on a specific date.\n"
            + "\n"
            + "\tFormat: find DATE\n"
            + "\n"
            + "\tExample:\n"
            + "\t\t- find 2019-09-09\n";

    private static final String EXP_ADD = "\t[ Adding a new expense: add ]\n"
            + "\tAdds and store the new expenses to a list.\n"
            + "\n"
            + "\tFormat: add ITEM, PRICE, DATE\n"
            + "\n"
            + "\tExample: \n"
            + "\t\t- add bread, $4, 2019-09-09\n";

    private static final String EXP_DELETE = "\t[ Delete a certain expense: delete expense ]\n"
            + "\tDeletes an expense from your expenses list.\n"
            + "\n"
            + "\tFormat: delete ITEM\n"
            + "\n"
            + "\tAlternative format: delete\n"
            + "\n"
            + "\tSteps for deleting an expense via index:\n"
            + "\t\t1. Type the command delete and press ENTER.\n"
            + "\t\t2. Type the index of the expense you want to delete and press ENTER.\n"
            + "\n"
            + "\tExample: \n"
            + "\t\t- delete bread\n";

    private  static final String EXP_UNDO =
            "\t[ Undo previous expense command: undo ]\n"
                    + "\tUndo the previous expenses command.\n"
                    + "\tCommands that can be undone:\n"
                    + "\t\tadd\n"
                    + "\t\tdelete\n"
                    + "\n"
                    + "\tFormat: undo\n";

    //----------------------------------specialisation-----------------------------
    private static final String HEADER_SPECIALISATION_PAGE = "********** Specialization page: spec **********\n"
            + "\n"
            + "Brings you to your specialization page from the main menu page. This specialization \n"
            + "page helps you be clearer of what specialization you can take in your course and record \n"
            + "the technical elective modules taken to see the progress of achieving that specialization.\n";

    private static final String SPEC_LIST = "\t[ List all specialization and Technical Electives ]\n"
            + "\tShows all possible specializations and their respective modules. Number of MCs completed\n"
            + "\tout of 20 will be shown too. (20MCs are needed to complete a specialization)\n"
            + "\n"
            + "\tFormat: list\n"
            + "\n"
            + "\tExample:\n"
            + "\t\t- list\n";

    private static final String SPEC_COMPLETE = "\t[ Key in completed electives ]\n"
            + "\tAllow users to mark their chosen elective as completed and record it under the "
            + "specific specialization.\n"
            + "\n"
            + "\tFormat: complete\n"
            + "\n"
            + "\tSteps for recording a completed technical elective module:\n"
            + "\t\t1. Type the command complete and press ENTER.\n"
            + "\t\t2. You will be prompted with the question \"Which specialization number is your module under?\"\n"
            + "\t\t3. Type the index of the specialization and press ENTER.\n"
            + "\t\t4. You will be prompted with the question \"Which module have you completed?\"\n"
            + "\t\t5. Type the index of the module completed and press ENTER.\n";

    //--------------------------------------password-----------------------------
    public static final String PASSWORD_PLANNER_PAGE = SEPARATOR_PAGE
            + "********** Password to enter the planner **********\n"
                    + "The password is a security measure to prevent other users from accessing the user's \n"
                    + "Gazeeebo without his permission. Default password is jjjry.\n"
                    + "Enter the correct password set\n"
                    + "Format: Password_text\n"
                    + "\n"
                    + "Example:\n"
                    + "\t- jjjry\n"
                    + SEPARATOR_PAGE;

    public static final String PASSWORD_CHANGE_PAGE = SEPARATOR_PAGE
            + "********** Change Password based on keyword: change password ********** \n"
                    + "Change Password. Feature can be called in the main page.\n"
                    + "\n"
                    + "Step 1: Input change password\n"
                    + "Step 2: Input old password.\n"
                    + "Step 2: Input new password.\n"
                    + "\n"
                    + SEPARATOR_PAGE;

    //----------------------------module planner-----------------------------------
    private static final String HEADER_MODULE_PLANNER_PAGE = "********** Module Planner Page **********\n"
            + "The Module Planner block mainly helps users to create and manage a 4-year module "
                + "plan for studying life in NUS\n"
                + "\n"
                + "How to get to the Module Planner page:\n"
                + "\t- From main page, type in command 'moduleplanner', And then system will drops "
                + "into Module Planner session\n"
                + "\t- You could only enter the module planner page from the main page\n";

    private static final String MODULE_PLANNER_PLAN =
            "\t[ Display the module plan table and showcase suggestions: plan ]\n"
            + "\tDescription: showcase the module plan table\n"
            + "\n"
            + "\tFormat: plan\n"
            + "\n"
            + "\tIf it is the first time user is using this feature, the system showcase default module plan \n"
            + "\ttable which is the CEG recommended module plan for AY18/19 intake.\n";

    private static final String MODULE_PLANNER_ADD =
            "\t[ Add module to specific semester column: add ]\n"
                    + "\tDescription: Add a new module to any column of the study plan table\n"
                    + "\n"
                    + "\tFormat: add module_code to semester_number\n"
                    + "\n"
                    + "\tExample: add CS4223 to 5\n"
                    + "\n"
                    + "\tSteps to add a command:\n"
                    + "\t\t1. Type in command add module_code to semester_number and press ENTER\n"
                    + "\t\t2. System will showcase the module is successfully added.\n"
                    + "\t\t\t- If adding is not successful, an IOException message will be displayed\n";

    private static final String MODULE_PLANNER_DELETE =
            "\t[ Delete module from specific semester column: delete ]\n"
                    + "\tDescription: delete an existing module from any column of the study plan table\n"
                    + "\n"
                    + "\tFormat: delete module_code from semester_number\n"
                    + "\n"
                    + "\tExample: delete CS4223 from 5\n"
                    + "\n"
                    + "\tSteps to add a command:\n"
                    + "\t\t1. Type in command delete module_code from semester_number and press ENTER\n"
                    + "\t\t2. System will showcase the module is successfully deleted.\n"
                    + "\t\t\t- If deleting is not successful, an IOException message will be displayed\n";

    private static final String MODULE_PLANNER_SHIFT =
            "\t[ Shift module from specific semester column to another column: shift ]\n"
                    + "\tDescription: shift an existing module from any column to another column of "
                    + "the study plan table\n"
                    + "\n"
                    + "\tFormat: shift module_code to semester_number\n"
                    + "\n"
                    + "\tExample: shift CS4223 to 5\n"
                    + "\n"
                    + "\tSteps to add a command:\n"
                    + "\t\t1. Type in command shift module_code to semester_numberand press ENTER\n"
                    + "\t\t2. System will showcase the module is successfully shifted.\n"
                    + "\t\t\t- If shifting is not successful, an IOException message will be displayed\n";

    private static final String MODULE_PLANNER_PREREQ =
            "\t[ Show a prerequisite tree of a module: prerequisite ]\n"
                    + "\tDescription: showcase all prerequisite requirements for a specific module.\n"
                    + "\n"
                    + "\tFormat: prerequisite Module_Code\n"
                    + "\n"
                    + "\tExample: prerequisite CS2040C";

    private static final String MODULE_PLANNER_UNDO =
            "\t[ Undo previous module planner command: undo ]\n"
                    + "\tUndo the previous module planner command.\n"
                    + "\tCommands that can be undone:\n"
                    + "\t\t- add\n"
                    + "\t\t- delete\n"
                    + "\t\t- shift\n"
                    + "\n"
                    + "\tFormat: undo\n";

    //--------------------------------exiting the program----------------------------------
    public static final String BYE_PAGE = SEPARATOR_PAGE
            + "********** Exiting the program: bye **********\n"
                    + "Exits the program.\n"
                    + "Format: bye\n"
                    + SEPARATOR_PAGE;

    //-----------------------------pages--------------------------------------
    public static final String HELP_PAGE = SEPARATOR_PAGE
            + HEADER_HELP_PAGE + SEPARATOR_COMMAND
            + HELP_FULL + SEPARATOR_COMMAND
            + HELP_INDIV + SEPARATOR_PAGE;

    public static final String TASKS_PAGE = SEPARATOR_PAGE
            + HEADER_TASKS_PAGE + SEPARATOR_COMMAND
            + TODO + SEPARATOR_COMMAND
            + DEADLINE + SEPARATOR_COMMAND
            + EVENT + SEPARATOR_COMMAND
            + LIST + SEPARATOR_COMMAND
            + DELETE + SEPARATOR_COMMAND
            + DONE + SEPARATOR_COMMAND
            + TASKS_FIND + SEPARATOR_COMMAND
            + SCHEDULE_DAILY + SEPARATOR_COMMAND
            + SCHEDULE_WEEKLY + SEPARATOR_COMMAND
            + SCHEDULE_MONTHLY + SEPARATOR_COMMAND
            + DO_WITHIN_PERIOD + SEPARATOR_COMMAND
            + TENTATIVE_EVENT_ADD + SEPARATOR_COMMAND
            + TENTATIVE_EVENT_CONFIRM + SEPARATOR_COMMAND
            + TASKS_EDIT + SEPARATOR_COMMAND
            + FIXED_DURATION_TASK + SEPARATOR_COMMAND
            + CATEGORIZE_TASKS + SEPARATOR_COMMAND
            + CALENDAR_VIEW_MONTHLY + SEPARATOR_COMMAND
            + CALENDAR_VIEW_ANNUAL + SEPARATOR_COMMAND
            + UNDONE + SEPARATOR_COMMAND
            + DONE_LIST + SEPARATOR_COMMAND
            + DO_AFTER_TASK + SEPARATOR_COMMAND
            + SNOOZE + SEPARATOR_COMMAND
            + RESCHEDULE + SEPARATOR_COMMAND
            + RECURRING_TASK + SEPARATOR_COMMAND
            + UNDONE_LIST + SEPARATOR_COMMAND
            + TAGGING + SEPARATOR_COMMAND
            + UNDO_COMMANDS + SEPARATOR_COMMAND
            + PERIOD_NOTE_ADD + SEPARATOR_COMMAND
            + PERIOD_NOTE_EDIT + SEPARATOR_COMMAND
            + PERIOD_NOTE_DELETE + SEPARATOR_COMMAND
            + PERIOD_NOTE_LIST + SEPARATOR_PAGE;

    public static final String PLACES_PAGE = SEPARATOR_PAGE
            + HEADER_PLACES_PAGE + SEPARATOR_COMMAND
            + PLACES_ADD + SEPARATOR_COMMAND
            + PLACES_FIND + SEPARATOR_COMMAND
            + PLACES_LIST + SEPARATOR_COMMAND
            + PLACES_DELETE + SEPARATOR_COMMAND
            + PLACES_UNDO + SEPARATOR_PAGE;

    public static final String NOTES_PAGE = SEPARATOR_PAGE
            + HEADER_NOTES_PAGE + SEPARATOR_COMMAND
            + NOTES_VIEW + SEPARATOR_COMMAND
            + NOTES_EDIT_GOAL + SEPARATOR_COMMAND
            + NOTES_ADD_MODULE + SEPARATOR_COMMAND
            + NOTES_DELETE_MODULE + SEPARATOR_COMMAND
            + NOTES_VIEW_COMMANDS + SEPARATOR_PAGE;

    public static final String MODULE_PAGE = SEPARATOR_PAGE
            + HEADER_MODULE_PAGE + SEPARATOR_COMMAND
            + MODULE_VIEW + SEPARATOR_COMMAND
            + MODULE_EDIT_MODULE_NAME + SEPARATOR_COMMAND
            + MODULE_ADD_ASSMT + SEPARATOR_COMMAND
            + MODULE_EDIT_ASSMT + SEPARATOR_COMMAND
            + MODULE_EDIT_WEIGHTAGE + SEPARATOR_COMMAND
            + MODULE_DELETE_ASSMT + SEPARATOR_COMMAND
            + MODULE_ADD_MSC + SEPARATOR_COMMAND
            + MODULE_EDIT_MSC + SEPARATOR_COMMAND
            + MODULE_DELETE_MSC + SEPARATOR_COMMAND
            + MODULE_VIEW_COMMANDS + SEPARATOR_COMMAND
            + MODULE_ESC + SEPARATOR_COMMAND
            + NOTES_ESC + SEPARATOR_PAGE;

    public static final String CONTACTS_PAGE = SEPARATOR_PAGE
            + HEADER_CONTACTS_PAGE + SEPARATOR_COMMAND
            + CONTACT_ADD + SEPARATOR_COMMAND
            + CONTACT_FIND + SEPARATOR_COMMAND
            + CONTACT_LIST + SEPARATOR_COMMAND
            + CONTACT_DELETE + SEPARATOR_COMMAND
            + CONTACT_UNDO + SEPARATOR_COMMAND
            + CONTACT_COMMANDS + SEPARATOR_PAGE;

    public static final String CAP_PAGE = SEPARATOR_PAGE
            + HEADER_CAP_PAGE + SEPARATOR_COMMAND
            + CAP_ADD_MODULE + SEPARATOR_COMMAND
            + CAP_FIND_MODULE + SEPARATOR_COMMAND
            + CAP_LIST_MODULE + SEPARATOR_COMMAND
            + CAP_DELETE_MODULE + SEPARATOR_COMMAND
            + CAP_COMMANDS + SEPARATOR_PAGE;

    public static final String EXPENSES_PAGE = SEPARATOR_PAGE
            + HEADER_EXPENSES_PAGE + SEPARATOR_COMMAND
            + EXP_LIST + SEPARATOR_COMMAND
            + EXP_FIND + SEPARATOR_COMMAND
            + EXP_ADD + SEPARATOR_COMMAND
            + EXP_DELETE + SEPARATOR_COMMAND
            + EXP_UNDO + SEPARATOR_PAGE;

    public static final String SPECIALIZATION_PAGE = SEPARATOR_PAGE
            + HEADER_SPECIALISATION_PAGE + SEPARATOR_COMMAND
            + SPEC_LIST + SEPARATOR_COMMAND
            + SPEC_COMPLETE + SEPARATOR_PAGE;

    public static final String MODULE_PLANNER_PAGE = SEPARATOR_PAGE
            + HEADER_MODULE_PLANNER_PAGE + SEPARATOR_COMMAND
            + MODULE_PLANNER_PLAN + SEPARATOR_COMMAND
            + MODULE_PLANNER_ADD + SEPARATOR_COMMAND
            + MODULE_PLANNER_DELETE + SEPARATOR_COMMAND
            + MODULE_PLANNER_SHIFT + SEPARATOR_COMMAND
            + MODULE_PLANNER_PREREQ + SEPARATOR_COMMAND
            + MODULE_PLANNER_UNDO + SEPARATOR_PAGE;
}