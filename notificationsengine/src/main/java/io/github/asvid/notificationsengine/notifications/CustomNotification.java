package io.github.asvid.notificationsengine.notifications;

import android.graphics.Bitmap;
import android.support.v4.app.NotificationCompat;

import java.util.List;

import io.github.asvid.notificationsengine.actions.ContentAction;
import io.github.asvid.notificationsengine.actions.NotificationAction;
import io.github.asvid.notificationsengine.config.LightSettings;
import io.github.asvid.notificationsengine.config.VibrationSettings;

/**
 * Created by adam on 29.06.16.
 */
public interface CustomNotification {

    CustomNotification setTitle(String title);

    CustomNotification setContent(String content);

    CustomNotification setIcon(int icon);

    CustomNotification setActions(List<NotificationAction> actions);

    CustomNotification setId(int ID);

    NotificationCompat.Builder setBuilder(NotificationCompat.Builder builder);

    List<NotificationAction> getActions();

    CustomNotification setBigText(String text);

    CustomNotification setBigPicture(Bitmap picture);

    CustomNotification setLargeIcon(Bitmap image);

    CustomNotification addInboxItem(String item);

    CustomNotification setInboxSummary(String item);

    CustomNotification setInboxItems(List<String> itemList);

    CustomNotification setContentAction(ContentAction contentAction);

    ContentAction getContentAction();

    LightSettings getLightSettings();

    CustomNotification setLightSettings(LightSettings lightSettings);

    CustomNotification setVibrationSettings(VibrationSettings vibrations);

    VibrationSettings getVibrationSettings();
}
