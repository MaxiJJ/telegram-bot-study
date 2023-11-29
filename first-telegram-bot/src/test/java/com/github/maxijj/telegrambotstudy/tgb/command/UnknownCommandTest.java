package com.github.maxijj.telegrambotstudy.tgb.command;

import static com.github.maxijj.telegrambotstudy.tgb.command.UnknownCommand.UNKNOWN_MESSAGE;

public class UnknownCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return "/i3rjnf38";
    }

    @Override
    String getCommandMessage() {
        return UNKNOWN_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new UnknownCommand(sendBotMessageService);
    }
}
