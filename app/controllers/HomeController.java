package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import sfm_test.Article;
import sfm_test.DatabaseService;
import views.html.index;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Inject;
import java.util.List;


public class HomeController extends Controller {

    private DatabaseService dbService;

    @Inject
    public HomeController(DatabaseService dataGenerator) {
        this.dbService = dataGenerator;
    }

    public Result index() {

        List<Article> articles = dbService.getArticles();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return ok(index.render(gson.toJson(articles)));
    }
}
