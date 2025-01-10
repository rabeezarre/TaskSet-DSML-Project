/**
 */
package fr.se301b.taskset;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.se301b.taskset.Task#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.se301b.taskset.Task#getPeriod <em>Period</em>}</li>
 *   <li>{@link fr.se301b.taskset.Task#getMinDelay <em>Min Delay</em>}</li>
 *   <li>{@link fr.se301b.taskset.Task#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see fr.se301b.taskset.TasksetPackage#getTask()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniquePortNames validPeriod'"
 * @generated
 */
public interface Task extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.se301b.taskset.DispatchKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see fr.se301b.taskset.DispatchKind
	 * @see #setKind(DispatchKind)
	 * @see fr.se301b.taskset.TasksetPackage#getTask_Kind()
	 * @model required="true"
	 * @generated
	 */
	DispatchKind getKind();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.Task#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see fr.se301b.taskset.DispatchKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DispatchKind value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(int)
	 * @see fr.se301b.taskset.TasksetPackage#getTask_Period()
	 * @model default="0"
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.Task#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

	/**
	 * Returns the value of the '<em><b>Min Delay</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Delay</em>' attribute.
	 * @see #setMinDelay(int)
	 * @see fr.se301b.taskset.TasksetPackage#getTask_MinDelay()
	 * @model default="0"
	 * @generated
	 */
	int getMinDelay();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.Task#getMinDelay <em>Min Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Delay</em>' attribute.
	 * @see #getMinDelay()
	 * @generated
	 */
	void setMinDelay(int value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link fr.se301b.taskset.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see fr.se301b.taskset.TasksetPackage#getTask_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

} // Task
