
public class Rotcod extends Doctor {
    @Override
    public void writeRecipe(String recipe) {
        StringBuilder stringBuilder = new StringBuilder(recipe).reverse();
        System.out.println("Рецепт задом наперед: " + stringBuilder);
    }
}
