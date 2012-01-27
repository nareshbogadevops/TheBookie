/*******************************************************************************
 *
 *  Copyright 2011 - Sardegna Ricerche, Distretto ICT, Pula, Italy
 *
 * Licensed under the EUPL, Version 1.1.
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 *  http://www.osor.eu/eupl
 *
 * Unless required by applicable law or agreed to in  writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 * In case of controversy the competent court is the Court of Cagliari (Italy).
 *******************************************************************************/
package persistence.mybatis.mappers;

import java.util.List;
import java.util.Map;
import model.Facility;

public interface FacilityMapper {
	public Integer insertFacility(Facility facility);
	public Integer insertStructureFacility(Map map);
	public Integer insertRoomTypeFacility(Map map);
	public Integer insertRoomFacility(Map map);	
	
	public Facility findFacilityById(Integer id);	
	public List<Integer> findStructureFacilityIdsByIdStructure(Integer id_structure);	
	public List<Integer> findRoomTypeFacilityIdsByIdStructure(Integer id_structure);
	public List<Integer> findRoomTypeFacilityIdsByIdRoomType(Integer id_roomType);	
	public List<Integer> findRoomFacilityIdsByIdStructure(Integer id_structure);
	public List<Integer> findRoomFacilityIdsByIdRoom(Integer id_room);			
	
	public Integer deleteFacility(Integer id);
	public Integer deleteStructureFacility(Map map);
	public Integer deleteRoomTypeFacility(Map map);
	public Integer deleteRoomFacility(Map map);
	
}