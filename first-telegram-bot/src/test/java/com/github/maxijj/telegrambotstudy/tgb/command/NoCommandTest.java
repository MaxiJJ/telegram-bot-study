package com.github.maxijj.telegrambotstudy.tgb.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.maxijj.telegrambotstudy.tgb.command.CommandName.NO;
import static com.github.maxijj.telegrambotstudy.tgb.command.NoCommand.NO_MESSAGE;

@DisplayName("Init-level testing for NoCommand")
public class NoCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return NO.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return NO_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new NoCommand(sendBotMessageService);
    }
}
