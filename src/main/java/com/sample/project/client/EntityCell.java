package com.sample.project.client;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.cell.client.ValueUpdater;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiRenderer;
import com.google.gwt.user.client.Window;

/**
 * Created by roger on 10/08/15.
 */
public class EntityCell extends AbstractCell<String> {

    interface EntityCellRenderer extends UiRenderer {
        void render(SafeHtmlBuilder sb, String entity);
        void onBrowserEvent(EntityCell c, NativeEvent e, Element p, String entity);
    }

    private static EntityCellRenderer renderer = GWT.create(EntityCellRenderer.class);

    @Override
    public void render(Context context, String value, SafeHtmlBuilder builder){
        renderer.render(builder, value);
    }

    @Override
    public void onBrowserEvent(Context context, Element parent, String value,
                               NativeEvent event, ValueUpdater<String> updater) {
        renderer.onBrowserEvent(this, event, parent, value);
    }

    public EntityCell(){
        super("click");
    }

    @UiHandler({"thingToClick"})
    void onSomethingHappened(ClickEvent event, Element parent, String entity) {
        Window.alert(entity + " was pressed!");
    }


}

