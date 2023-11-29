package com.github.maxijj.telegrambotstudy.tgb.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.maxijj.telegrambotstudy.tgb.command.CommandName.STOP;
import static com.github.maxijj.telegrambotstudy.tgb.command.StopCommand.STOP_MESSAGE;

@DisplayName("Init-level testing for StopCommand")
public class StopCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return STOP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return STOP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StartCommand(sendBotMessageService);
    }
}
