package org.ktachibana.cloudemoji;

import android.os.Environment;

import java.io.File;

public interface Constants {
    // General
    public static final String USER_DICTIONARY_APP_ID = "cloudemoji";

    // Left drawer list item
    public static final long LIST_ITEM_FAVORITE_ID = -1;
    public static final long LIST_ITEM_HISTORY_ID = -2;
    public static final long LIST_ITEM_BUILT_IN_EMOJI_ID = -3;

    public static final long LIST_ITEM_REPOSITORY_MANAGER_ID = 0;
    public static final long LIST_ITEM_SETTINGS_ID = 1;
    public static final long LIST_ITEM_EXIT_ID = 2;
    public static final long LIST_ITEM_ACCOUNT_ID = 3;
    public static final long LIST_ITEM_STORE_ID = 4;
    public static final long LIST_ITEM_UPDATE_CHECKER_ID = 5;

    // Notification
    public static final int PERSISTENT_NOTIFICATION_ID = 0;

    // Preferences
    public static final String PREF_CLOSE_AFTER_COPY = "pref_close_after_copy";
    public static final String PREF_NOTIFICATION_VISIBILITY = "pref_notification_visibility";
    public static final String PREF_SHOW_AFTER_BOOT_UP = "pref_show_after_boot_up";
    public static final String PREF_VERSION = "pref_version";
    public static final String PREF_GIT_HUB_RELEASE = "pref_git_hub_release";
    public static final String PREF_GIT_HUB_REPO = "pref_git_hub_repo";
    public static final String PREF_HAS_RUN_BEFORE = "pref_has_run_before";
    public static final String PREF_NAVBAR_GESTURE = "pref_navbar_gesture";
    public static final String PREF_BACKUP_FAV = "pref_backup_fav";
    public static final String PREF_RESTORE_FAV = "pref_restore_fav";
    public static final String PREF_IMPORT_IME = "pref_import_into_ime";
    public static final String PREF_REVOKE_IME = "pref_revoke_from_ime";

    // Repository
    public static final int FORMAT_TYPE_XML = 0;
    public static final int FORMAT_TYPE_JSON = 1;

    // URLs
    public static final String DEFAULT_REPOSITORY_URL = "https://dl.dropboxusercontent.com/u/120725807/test.xml";
    public static final String GIT_HUB_RELEASE_URL = "https://github.com/KTachibanaM/cloudemoji/releases";
    public static final String GIT_HUB_REPO_URL = "https://github.com/KTachibanaM/cloudemoji";
    public static final String CLOUD_API_HOST = "http://ce.catofes.com";
    public static final String STORE_URL = "http://emoticon.moe/?cat=2";
    public static final String UPDATE_CHECKER_URL = "https://cloudemoticonbackend.herokuapp.com/version";
    public static final String PLAY_STORE_URL = "https://play.google.com/store/apps/details?id=org.ktachibana.cloudemoji";

    // Intent
    public static final int REPOSITORY_MANAGER_REQUEST_CODE = 0;
    public static final int PREFERENCE_REQUEST_CODE = 1;

    // File
    public static final String FAVORITES_BACKUP_FILE_PATH
            = Environment.getExternalStorageDirectory().getPath() + File.separator + "ce.json";
    public static final String EXPORT_FILE_PATH
            = Environment.getExternalStorageDirectory().getPath() + File.separator + "%s";

    // Debug
    public static final String DEBUG_TAG = "CloudEmoticon";

}
