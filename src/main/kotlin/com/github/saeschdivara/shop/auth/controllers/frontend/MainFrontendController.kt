package com.github.saeschdivara.shop.auth.controllers.frontend

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
@RequestMapping
class MainFrontendController {

    @GetMapping
    fun frontend(oauthToken: OAuth2AuthenticationToken): ModelAndView {
        return ModelAndView("auth/index")
    }

}