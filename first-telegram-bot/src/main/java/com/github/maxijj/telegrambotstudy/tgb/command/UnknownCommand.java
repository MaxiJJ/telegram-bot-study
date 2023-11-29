package com.github.maxijj.telegrambotstudy.tgb.command;

import com.github.maxijj.telegrambotstudy.tgb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class UnknownCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public static final String UNKNOWN_MESSAGE = "Ничего не понял \uD83D\uDE1F, напишите /help и тогда мы с вами" +
            " найдём общий язык";

    public UnknownCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), UNKNOWN_MESSAGE);
    }
}
