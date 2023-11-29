package com.github.maxijj.telegrambotstudy.tgb.command;

import com.github.maxijj.telegrambotstudy.tgb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class NoCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public NoCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    public static final String NO_MESSAGE = "Напиши плиз команду со слеша, я работаю только с ними -> (/). \n" +
            " Чтобы понять что воодить, напиши /help и я тебе помогу :)";

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), NO_MESSAGE);
    }
}
