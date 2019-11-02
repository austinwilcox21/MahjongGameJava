public abstract class RankTile extends Tile
{
    protected int rank;

    public RankTile(int rank) {
        this.rank = rank;
    }

    public boolean matches(Tile tileToCheck)
    {
        if(super.matches(tileToCheck))
        {
            if(tileToCheck.toString().equals(this.toString()))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}