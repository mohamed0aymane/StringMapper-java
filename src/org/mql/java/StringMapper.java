package org.mql.java;
import java.lang.reflect.*;
import java.util.HashSet;
import java.util.Set;

public class StringMapper{
	//set utiliser pour stocker les objets qu'on a passe par et detecter les references circulaires
	private static final Set<Object> set=new HashSet<>();
	
	public static String toString(Object obj) {
		//on verifie  si l'objet est vide ou nn
		if (obj==null) return null;
		
		//si on a passe par l'objet,on detecte une boucle recursive 
        if (set.contains(obj)) {
            return " Classe lis elle meme " +obj.getClass().getSimpleName();
        }

        // Ajouter l'objet actuel à l'ensemble des objets visités
        set.add(obj);
		
		StringBuilder sb=new StringBuilder();
		Class<?> cls=obj.getClass();
		
		sb.append(cls.getSimpleName()).append(" { ");
		
		
		Field[] fields=cls.getDeclaredFields();
	
		
		for(int i=0;i<fields.length;i++) {
			Field field=fields[i];
			
			try {
				//pour acceder aux champs prives
				field.setAccessible(true);

				sb.append(field.getType().getSimpleName()).append(" ")
				.append(field.getName()+" : ");
				
				Object value=field.get(obj);
				
				
				//verifier si les types primitifs ou wrappers
				if (value == null) {
                    sb.append("null");
                } else if (field.getType().isPrimitive() || isWrapperOrString(value.getClass())) {
                    // Si le champ est un type primitif ou une classe simple (Wrapper, String)
                    sb.append(value);
                } else if (field.getType().isArray()) {
                    // Si le champ est un tableau, gérer la conversion en chaîne
                    sb.append(arrayToString(value));
                } else {
                    // Sinon, appliquer récursivement toString sur l'objet
                    sb.append(toString(value));
                }
            } catch (Exception e) {
                sb.append("Error accessing field");
            }
			if (i < fields.length - 1) {
                sb.append(", ");
                
            }
		}
		sb.append(" }");
		//supprimer l'objet de l'ensemble apres traitement 
		set.remove(obj);
		
		return sb.toString();
		
	}

	private static boolean isWrapperOrString(Class<?> cls) {
		 return cls.isPrimitive() ||
	                cls == Integer.class ||
	                cls == Double.class ||
	                cls == Float.class ||
	                cls == Long.class ||
	                cls == Short.class ||
	                cls == Byte.class ||
	                cls == Boolean.class ||
	                cls == Character.class ||
	                cls == String.class;
	}

	private static String arrayToString(Object array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        int length = Array.getLength(array);

        for (int i = 0; i < length; i++) {
            Object element = Array.get(array, i);
            if (element == null) {
                sb.append("null");
            } else if (element.getClass().isArray()) {
                sb.append(arrayToString(element));
            } else {
                sb.append(element);
            }
            if (i < length - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}