package pl.mineblood.depends;

import lombok.Getter;

/**
 * Created by Szymon on 2016-05-14.
 */
public enum GroupType {

    GRACZ(0);

    @Getter
    private final int id;

    GroupType(int id) {
        this.id = id;
    }
    public boolean checkPermission(GroupType type) {
        return id >= type.getId();
    }
}
