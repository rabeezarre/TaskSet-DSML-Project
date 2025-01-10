/**
 */
package fr.se301b.taskset.util;

import fr.se301b.taskset.*;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see fr.se301b.taskset.TasksetPackage
 * @generated
 */
public class TasksetValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TasksetValidator INSTANCE = new TasksetValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fr.se301b.taskset";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TasksetValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return TasksetPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case TasksetPackage.TASK:
			return validateTask((Task) value, diagnostics, context);
		case TasksetPackage.PORT:
			return validatePort((Port) value, diagnostics, context);
		case TasksetPackage.CONNECTION:
			return validateConnection((Connection) value, diagnostics, context);
		case TasksetPackage.TASKS_SET:
			return validateTasksSet((TasksSet) value, diagnostics, context);
		case TasksetPackage.NAMED_ELEMENT:
			return validateNamedElement((NamedElement) value, diagnostics, context);
		case TasksetPackage.DISPATCH_KIND:
			return validateDispatchKind((DispatchKind) value, diagnostics, context);
		case TasksetPackage.PORT_DIRECTION:
			return validatePortDirection((PortDirection) value, diagnostics, context);
		case TasksetPackage.DATA_TYPE:
			return validateDataType((DataType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(task, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTask_uniquePortNames(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTask_validPeriod(task, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniquePortNames constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTask_uniquePortNames(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		Set<String> portNames = new HashSet<String>();
		for (Port port : task.getPorts()) {
			if (!portNames.add(port.getName())) {
				if (diagnostics != null) {
					diagnostics.add(
							createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
									new Object[] { "uniquePortNames", getObjectLabel(task, context) },
									new Object[] { task }, context));
				}
				return false;
			}
		}
		return true;
	}

	/**
	 * Validates the validPeriod constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTask_validPeriod(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (task.getKind() == DispatchKind.PERIODIC && task.getPeriod() <= 0) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "validPeriod", getObjectLabel(task, context) }, new Object[] { task }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(port, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnection_validPortTypes(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnection_validQueueSize(connection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validPortTypes constraint of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConnection_validPortTypes(Connection connection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		Port sourcePort = connection.getSourcePort();
		Port destPort = connection.getDestPort();
		if (sourcePort.getDirection() != PortDirection.OUT) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "validPortTypes", getObjectLabel(connection, context) },
								new Object[] { connection }, context));
			}
			return false;
		}
		if (destPort.getDirection() != PortDirection.IN) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "validPortTypes", getObjectLabel(connection, context) },
								new Object[] { connection }, context));
			}
			return false;
		}
		if (!sourcePort.getDataType().equals(destPort.getDataType())) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "validPortTypes", getObjectLabel(connection, context) },
								new Object[] { connection }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the validQueueSize constraint of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConnection_validQueueSize(Connection connection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (connection.getQueueSize() <= 0) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "validQueueSize", getObjectLabel(connection, context) },
								new Object[] { connection }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTasksSet(TasksSet tasksSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tasksSet, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(tasksSet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(tasksSet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(tasksSet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(tasksSet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(tasksSet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(tasksSet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(tasksSet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(tasksSet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTasksSet_uniqueTaskNames(tasksSet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTasksSet_singleRootTaskSet(tasksSet, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueTaskNames constraint of '<em>Tasks Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTasksSet_uniqueTaskNames(TasksSet tasksSet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		Set<String> taskNames = new HashSet<>();
		for (Task task : tasksSet.getTasks()) {
			if (!taskNames.add(task.getName())) {
				if (diagnostics != null) {
					diagnostics.add(
							createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
									new Object[] { "uniqueTaskNames", getObjectLabel(tasksSet, context) },
									new Object[] { tasksSet }, context));
				}
				return false;
			}
		}
		return true;
	}

	/**
	 * Validates the singleRootTaskSet constraint of '<em>Tasks Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTasksSet_singleRootTaskSet(TasksSet tasksSet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		Resource resource = tasksSet.eResource();
		if (resource != null) {
			long taskSetCount = resource.getContents().stream().filter(e -> e instanceof TasksSet).count();
			if (taskSetCount > 1) {
				if (diagnostics != null) {
					diagnostics.add(
							createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
									new Object[] { "singleRootTaskSet", getObjectLabel(tasksSet, context) },
									new Object[] { tasksSet }, context));
				}
				return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispatchKind(DispatchKind dispatchKind, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortDirection(PortDirection portDirection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return super.getResourceLocator();
	}

} //TasksetValidator
