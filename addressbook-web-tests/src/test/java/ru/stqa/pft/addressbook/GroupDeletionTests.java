package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    gotoGrouoPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }

}
