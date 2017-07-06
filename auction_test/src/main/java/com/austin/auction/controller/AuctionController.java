package com.austin.auction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuctionController {
 
    @RequestMapping(value = "createauction", method = RequestMethod.GET)
    public String createAuction() {
        return "createauction";
    }
    @RequestMapping(value = "auctioncenter", method = RequestMethod.GET)
    public String auctionCenter() {
        return "auctioncenter";
    }  
    
    @RequestMapping(value = "createbidding", method = RequestMethod.GET)
    public String createBidding() {
        return "createbidding";
    }    
    
    
    @RequestMapping(value = "currentrank", method = RequestMethod.GET)
    public String currentRank() {
        return "currentrank";
    }    
    @RequestMapping(value = "allranks", method = RequestMethod.GET)
    public String allRanks() {
        return "allranks";
    }    
    
    @RequestMapping(value = "finalresult", method = RequestMethod.GET)
    public String finalResult() {
        return "finalresult";
    } 
    
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    
}
