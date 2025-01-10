/**
 */
package fr.se301b.taskset;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tasks Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.se301b.taskset.TasksSet#getTasks <em>Tasks</em>}</li>
 *   <li>{@link fr.se301b.taskset.TasksSet#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see fr.se301b.taskset.TasksetPackage#getTasksSet()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueTaskNames singleRootTaskSet'"
 * @generated
 */
public interface TasksSet extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link fr.se301b.taskset.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see fr.se301b.taskset.TasksetPackage#getTasksSet_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link fr.se301b.taskset.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see fr.se301b.taskset.TasksetPackage#getTasksSet_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // TasksSet
