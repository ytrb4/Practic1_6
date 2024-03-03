public class AngryDoc extends Doctor{
    @Override
    public void writeRecipe(String recipe) {
        super.writeRecipe(recipe.toUpperCase() + "!!!!");
    }
}
