package com.sample.project.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.SingleSelectionModel;

import java.util.ArrayList;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ProjectEntryPoint implements EntryPoint {

  private ListDataProvider<String> dataProvider = new ListDataProvider<>();
  final SingleSelectionModel<String> selectionModel = new SingleSelectionModel<String>();


  @Override
  public void onModuleLoad() {


    RootPanel.get().add(new HTML("GWT App has loaded."));

      ShowMorePagerPanel pagerPanel = new ShowMorePagerPanel();

      EntityCell entityCell1 = new EntityCell();

      CellList<String> cellList = new CellList<String>(entityCell1);

      cellList.setSelectionModel(selectionModel);

      ArrayList<String> list = new ArrayList<>();
      list.add("this");
      list.add("is");
      list.add("a");
      list.add("simple");
      list.add("test");

      dataProvider.setList(list);
      dataProvider.addDataDisplay(cellList);

      pagerPanel.setDisplay(cellList);

      RootPanel.get().add(pagerPanel);

    }

}
