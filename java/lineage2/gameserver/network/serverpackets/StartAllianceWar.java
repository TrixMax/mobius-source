/*
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package lineage2.gameserver.network.serverpackets;

/**
 * @author Mobius
 * @version $Revision: 1.0 $
 */
public class StartAllianceWar extends L2GameServerPacket
{
	/**
	 * Field _allianceName.
	 */
	private final String _allianceName;
	/**
	 * Field _char.
	 */
	private final String _char;
	
	/**
	 * Constructor for StartAllianceWar.
	 * @param alliance String
	 * @param charName String
	 */
	public StartAllianceWar(String alliance, String charName)
	{
		_allianceName = alliance;
		_char = charName;
	}
	
	/**
	 * Method writeImpl.
	 */
	@Override
	protected final void writeImpl()
	{
		writeC(0xc2);
		writeS(_char);
		writeS(_allianceName);
	}
}
