package org.jboss.resteasy.testi18n;

import java.util.Locale;

/**
 * 
 * @author <a href="ron.sigal@jboss.com">Ron Sigal</a>
 * @version $Revision: 1.1 $
 * 
 * Copyright Sep 26, 2014
 */
public class TestLogMessages_us_EN extends TestLogMessages_Abstract
{
   @Override
   protected Locale getLocale()
   {
      return new Locale("us", "EN");
   }

   @Override
   protected String failedExecuting()
   {
      return "Failed executing";
   }

   @Override
   protected String couldNotDeleteFile()
   {
      return "Could not delete file '%s' for request:";
   }

   @Override
   protected String deploying()
   {
      return "Deploying ";
   }

   @Override
   protected String creatingContextObject()
   {
      return "Creating context object <%s : %s>";
   }  
}
