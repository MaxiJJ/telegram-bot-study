package com.github.maxijj.telegrambotstudy.tgb.command;

import com.github.maxijj.telegrambotstudy.tgb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

import static com.github.maxijj.telegrambotstudy.tgb.command.CommandName.*;

public class HelpCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public HelpCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    public static final String HELP_MESSAGE = String.format("✨<b>Дотупные команды</b>✨\n\n"

            + "<b>Начать\\закончить работу с ботом</b>\n"
            + "%s - начать работу со мной\n"
            + "%s - приостановить работу со мной\n\n"
            + "%s - получить помощь в работе со мной\n",
            START.getCommandName(), STOP.getCommandName(), HELP.getCommandName());

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), HELP_MESSAGE);
    }
}
