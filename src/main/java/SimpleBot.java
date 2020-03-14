import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class SimpleBot extends TelegramLongPollingBot {
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            try {
                execute(new SendMessage(update.getMessage().getChatId(), "проверка"));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }

    }

    public String getBotUsername() {
        return "Morefon_Bot";
    }

    public String getBotToken() {
        return "930125596:AAFmtwaevpk7D3PJpIMaWdsUH6hYrAklOU4";
    }
}
