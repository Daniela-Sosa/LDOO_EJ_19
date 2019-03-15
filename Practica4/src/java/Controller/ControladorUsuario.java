
package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
   public class ControladorUsuario {

    @RequestMapping(value = "/usuario", method = RequestMethod.GET)
   public ModelAndView usuario() {
      return new ModelAndView("usuario", "command", new Usuario());
   }
   @RequestMapping(value = "/addUsuario", method = RequestMethod.POST)
      public String addUsuario(@ModelAttribute("SpringWeb")Usuario usuario, 
   
   ModelMap model) {
      model.addAttribute("name", usuario.getName());
      model.addAttribute("age", usuario.getAge());
      model.addAttribute("id", usuario.getId());
      
      return "result";
   }
}

